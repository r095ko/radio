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
        Radio nextStation = new Radio();
        nextStation.setNextStation(5);

        int expected = 6;
        int actual = nextStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOver9() {
        Radio nextStation = new Radio();
        nextStation.setNextStation(10);

        int expected = 0;
        int actual = nextStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio prevStation = new Radio();
        prevStation.setPrevStation(6);

        int expected = 5;
        int actual = prevStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOver9() {
        Radio prevStation = new Radio();
        prevStation.setPrevStation(10);

        int expected = 10;
        int actual = prevStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation0() {
        Radio prevStation = new Radio();
        prevStation.setPrevStation(0);

        int expected = 9;
        int actual = prevStation.getPrevStation();

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
        Radio increaseVolume = new Radio();
        increaseVolume.setIncreaseVolume(3);

        int expected = 4;
        int actual = increaseVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOver10() {
        Radio increaseVolume = new Radio();
        increaseVolume.setIncreaseVolume(11);

        int expected = 10;
        int actual = increaseVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume0() {
        Radio increaseVolume = new Radio();
        increaseVolume.setIncreaseVolume(0);

        int expected = 1;
        int actual = increaseVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.setDecreaseVolume(8);

        int expected = 7;
        int actual = decreaseVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume0() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.setDecreaseVolume(0);

        int expected = 0;
        int actual = decreaseVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeOver10() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.setDecreaseVolume(11);

        int expected = 10;
        int actual = decreaseVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }
}
