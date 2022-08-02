package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldSetNextNumberStationMax() {
        Radio station = new Radio();

        station.setNumberStation(9);

        int expected = 0;
        station.next();
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStation() {
        Radio station = new Radio();

        station.setNumberStation(6);

        int expected = 7;
        station.next();
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationMin() {
        Radio station = new Radio();

        station.setNumberStation(0);

        int expected = 9;
        station.prev();
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStation() {
        Radio station = new Radio();

        station.setNumberStation(1);

        int expected = 0;
        station.prev();
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationValid() {
        Radio station = new Radio();

        station.setNumberStation(5);

        int expected = 7;
        station.setNumberStation(7);
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationNotValidUp() {
        Radio station = new Radio();

        station.setNumberStation(4);

        int expected = 4;
        station.setNumberStation(11);
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationNotValidDown() {
        Radio station = new Radio();

        station.setNumberStation(4);

        int expected = 4;
        station.setNumberStation(-2);
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        volume.up();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolumeMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        volume.down();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(8);

        int expected = 7;
        volume.down();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(3);

        int expected = 4;
        volume.up();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
