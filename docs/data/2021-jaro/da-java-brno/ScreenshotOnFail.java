package cz.czechitas.selenium;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class ScreenshotOnFail implements TestWatcher {

    private WebDriver browser;

    public ScreenshotOnFail() {
        System.out.println("Registered");
    }

    public ScreenshotOnFail(WebDriver browser) {
        this.browser = browser;
    }

    public void setBrowser(WebDriver newValue) {
        browser = newValue;
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        try {
            if (browser == null) {
                browser = findWebDriverInstance(context);
            }
            if (browser != null) {
                byte[] screenshot = ((TakesScreenshot) browser).getScreenshotAs(OutputType.BYTES);
                String screenshotName = "Failed test " + context.getDisplayName();
                screenshotName = screenshotName.replace("()", ".png");
                Path screenshotFile = Paths.get(screenshotName);
                try (OutputStream output = Files.newOutputStream(screenshotFile)) {
                    output.write(screenshot);
                }
                System.err.println("Assertion failed! Browser screenshot saved as '" + screenshotFile + "'");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private WebDriver findWebDriverInstance(ExtensionContext context) {
        Optional<Object> testInstanceHolder = context.getTestInstance();
        if (testInstanceHolder.isEmpty()) return null;
        Object testInstance = testInstanceHolder.get();
        Field[] fields = testInstance.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (WebDriver.class.isAssignableFrom(field.getType())) {
                try {
                    boolean accessible = field.canAccess(testInstance);
                    if (!accessible) {
                        field.setAccessible(true);
                        WebDriver result = (WebDriver) field.get(testInstance);
                        field.setAccessible(false);
                        return result;
                    } else {
                        return (WebDriver) field.get(testInstance);
                    }
                } catch (InaccessibleObjectException | IllegalAccessException e) {
                    // Ignore, just act as no field was found
                }
            }
        }
        return null;
    }
}
