"use strict";

let frmRandomWebsite = document.querySelector("#frmRandomWebsite");
let btnStart = document.querySelector("#btnStart");
let btnStop = document.querySelector("#btnStop");
let labProgress = document.querySelector("#labProgress");
let timer = null;

btnStart.addEventListener("click", startRandomize);
btnStop.addEventListener("click", stopRandomize);

function startRandomize() {
    if (timer !== null) {
        stopRandomize();
    }
    labProgress.textContent = "Started waiting";
    timer = setInterval(randomize, 10000);
    randomize();
}

function stopRandomize() {
    if (timer === null) return;
    clearInterval(timer);
    timer = null;
    labProgress.textContent = "Stopped waiting";
}

function randomize() {
    let text = labProgress.textContent;
    if (text.length > 200) {
        text = "Clear";
    }
    labProgress.textContent = text + ", Loading page";
    frmRandomWebsite.src = "https://random.whatsmyip.org/";
}
