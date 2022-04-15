package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.radio.Radio.*;

public class RadioTest {

    @Test
    public void test() {
        Radio currentStation = new Radio();
        Radio.setCurrentStation(10);

        int expected = 0;
        int actual = getCurrentStation();

        assertEquals(expected, actual);
    }
}
