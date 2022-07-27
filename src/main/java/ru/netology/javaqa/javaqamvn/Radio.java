package ru.netology.javaqa.javaqamvn;

public class Radio {
    public int numberStation;
    public int currentVolume;

    public void next() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    public void prev() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public void setNumberStation(int currentNumber) {
        if (currentNumber > 9) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        numberStation = currentNumber;
    }

    public void up() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void down() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
