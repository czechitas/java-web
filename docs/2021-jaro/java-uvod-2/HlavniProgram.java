package cz.czechitas.kockamyssyr;

import java.util.*;
import cz.czechitas.kockamyssyr.api.*;
import net.sevecek.util.*;

public class HlavniProgram {

    public void main(String[] args) {
        new Tree(400, 200);
        new Tree(250, 0);

        var micka = new Cat(50, 50);
        var sylvester = new Cat(150, 400);
        var garfield = new Cat(300, 200);
        micka.moveForward(100);
        garfield.turnRight();
        garfield.moveForward(700);

        micka.setBrain( it -> {
            // Obejdete s mickou "lezatou osmicku" kolem hran herniho okna.
            micka.moveForward(400);
            micka.turnRight();
            micka.moveForward(400);
            micka.turnLeft();
            micka.moveForward(500);
            micka.turnLeft();
            micka.moveForward(400);
            micka.turnLeft();
            micka.moveForward(500);
            micka.turnLeft();
            micka.moveForward(400);
            micka.turnRight();
            micka.moveForward(500);
            micka.turnRight();
            micka.moveForward(400);
            micka.turnRight();
        });


        new Cheese(500, 300);

        var generatorNahodu = new Random();
        var x = generatorNahodu.nextInt(1000);
        var y = generatorNahodu.nextInt(600);
        new Cheese(x, y);
        var x2 = generatorNahodu.nextInt(1000);
        var y2 = generatorNahodu.nextInt(600);
        new Cheese(x2, y2);

        var jerry = new Mouse(600, 200);
        var ovladatkoPomociKlaves = new KeyboardBrain();
        jerry.setBrain(ovladatkoPomociKlaves);

        var gonzales = new Mouse(600, 200);
        var ovladatkoPomociJinychKlaves = new KeyboardBrain(
                KeyCode.W, KeyCode.A, KeyCode.S, KeyCode.D);
        gonzales.setBrain(ovladatkoPomociJinychKlaves);
    }

}
