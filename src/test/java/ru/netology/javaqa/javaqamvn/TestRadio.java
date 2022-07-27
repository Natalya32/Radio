package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldSetNextNumberStationMax() {
        Radio station = new Radio();

        station.numberStation = 9;

        int expected = 0;
        station.next();
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStation() {
        Radio station = new Radio();

        station.numberStation = 6;

        int expected = 7;
        station.next();
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationMin() {
        Radio station = new Radio();

        station.numberStation = 0;

        int expected = 9;
        station.prev();
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStation() {
        Radio station = new Radio();

        station.numberStation = 1;

        int expected = 0;
        station.prev();
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationValid() {
        Radio station = new Radio();

        station.numberStation = 5;

        int expected = 7;
        station.setNumberStation(7);
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationNotValidUp() {
        Radio station = new Radio();

        station.numberStation = 4;

        int expected = 4;
        station.setNumberStation(11);
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationNotValidDown() {
        Radio station = new Radio();

        station.numberStation = 4;

        int expected = 4;
        station.setNumberStation(-2);
        int actual = station.numberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolumeMax() {
        Radio volume = new Radio();

        volume.currentVolume = 10;

        int expected = 10;
        volume.up();
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolumeMin() {
        Radio volume = new Radio();

        volume.currentVolume = 0;

        int expected = 0;
        volume.down();
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume() {
        Radio volume = new Radio();

        volume.currentVolume = 8;

        int expected = 7;
        volume.down();
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume() {
        Radio volume = new Radio();

        volume.currentVolume = 3;

        int expected = 4;
        volume.up();
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


}
