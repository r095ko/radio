package ru.netology.radio;

public class Radio {

    public static int currentStation;

    public static int getCurrentStation() {
        return currentStation;
    }

    public static void setCurrentStation(int newCurrentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

}
