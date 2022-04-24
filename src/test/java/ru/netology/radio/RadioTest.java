package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio currentStation = new Radio();
        currentStation.setCurrentStation(5);

        int expected = 5;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStation0() {
        Radio currentStation = new Radio();
        currentStation.setCurrentStation(-1);

        int expected = 0;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationOver9() {
        Radio currentStation = new Radio();
        currentStation.setCurrentStation(10);

        int expected = 0;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio currentStation = new Radio();
        currentStation.setNextStation(5);

        int expected = 6;
        int actual = currentStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOver9() {
        Radio currentStation = new Radio();
        currentStation.setNextStation(10);

        int expected = 0;
        int actual = currentStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio currentStation = new Radio();
        currentStation.setPrevStation(6);

        int expected = 5;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOver9() {
        Radio currentStation = new Radio();
        currentStation.setPrevStation(10);

        int expected = 10;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation0() {
        Radio currentStation = new Radio();
        currentStation.setPrevStation(0);

        int expected = 9;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(7);

        int expected = 7;
        int actual = currentVolume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeOver10() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(11);

        int expected = 10;
        int actual = currentVolume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume0() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(-1);

        int expected = 0;
        int actual = currentVolume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setIncreaseVolume(3);

        int expected = 4;
        int actual = currentVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOver10() {
        Radio currentVolume = new Radio();
        currentVolume.setIncreaseVolume(11);

        int expected = 10;
        int actual = currentVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume0() {
        Radio currentVolume = new Radio();
        currentVolume.setIncreaseVolume(0);

        int expected = 1;
        int actual = currentVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setDecreaseVolume(8);

        int expected = 7;
        int actual = currentVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume0() {
        Radio currentVolume = new Radio();
        currentVolume.setDecreaseVolume(0);

        int expected = 0;
        int actual = currentVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeOver10() {
        Radio currentVolume = new Radio();
        currentVolume.setDecreaseVolume(11);

        int expected = 10;
        int actual = currentVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }
}
