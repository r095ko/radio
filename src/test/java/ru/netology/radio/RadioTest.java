package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.radio.Radio.*;

public class RadioTest {

    @Test
    public void testCurrent() {
        Radio currentStation = new Radio();
        Radio.setCurrentStation(10);

        int expected = 0;
        int actual = getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        Radio currentStation = new Radio();
        Radio.setNextStation(5);

        int expected = 6;
        int actual = getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio currentStation = new Radio();
        Radio.setNextStation(9);

        int expected = 8;
        int actual = getCurrentStation();

        assertEquals(expected, actual);
    }
}
