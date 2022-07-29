package ru.netology.javaqa.javaqamvn;

public class Radio {
    public int numberStation;
    public int currentVolume;
    public int maxNumberStation;

    public Radio (int stations) {
        this.maxNumberStation = stations - 1;
    }

    public Radio () {
        this.maxNumberStation = 9;
    }

    public void next() {
        if (numberStation == maxNumberStation) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }
    }

    public void prev() {
        if (numberStation == 0) {
            numberStation = maxNumberStation;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public void setNumberStation(int currentNumber) {
        if (currentNumber > maxNumberStation) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        numberStation = currentNumber;
    }

    public void up() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void down() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
