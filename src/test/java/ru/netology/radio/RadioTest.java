package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio currentStation = new Radio(15);
        currentStation.setCurrentStation(5);

        int expected = 5;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStation0() {
        Radio currentStation = new Radio(15);
        currentStation.setCurrentStation(-1);

        int expected = 0;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationOverQuantity() {
        Radio currentStation = new Radio(15);
        currentStation.setCurrentStation(16);

        int expected = 0;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationOverDefault() {
        Radio currentStation = new Radio();
        currentStation.setCurrentStation(11);

        int expected = 0;
        int actual = currentStation.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio currentStation = new Radio(15);
        currentStation.setNextStation(5);

        int expected = 6;
        int actual = currentStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOverQauntity() {
        Radio currentStation = new Radio(15);
        currentStation.setNextStation(16);

        int expected = 0;
        int actual = currentStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOverQauntityDefault() {
        Radio currentStation = new Radio();
        currentStation.setNextStation(11);

        int expected = 0;
        int actual = currentStation.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio currentStation = new Radio(15);
        currentStation.setPrevStation(6);

        int expected = 5;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }


    @Test
    public void testPrevStation0() {
        Radio currentStation = new Radio(15);
        currentStation.setPrevStation(0);

        int expected = 15;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation15() {
        Radio currentStation = new Radio(15);
        currentStation.setPrevStation(15);

        int expected = 14;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOverQauntity() {
        Radio currentStation = new Radio(15);
        currentStation.setPrevStation(16);

        int expected = 16;
        int actual = currentStation.getPrevStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOverQauntityDefault() {
        Radio currentStation = new Radio();
        currentStation.setPrevStation(11);

        int expected = 11;
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
    public void testCurrentVolumeOver100() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(101);

        int expected = 100;
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
        currentVolume.setIncreaseVolume(53);

        int expected = 54;
        int actual = currentVolume.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOver100() {
        Radio currentVolume = new Radio();
        currentVolume.setIncreaseVolume(101);

        int expected = 100;
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
    public void testDecreaseVolumeOver100() {
        Radio currentVolume = new Radio();
        currentVolume.setDecreaseVolume(101);

        int expected = 100;
        int actual = currentVolume.getDecreaseVolume();

        assertEquals(expected, actual);
    }
}
