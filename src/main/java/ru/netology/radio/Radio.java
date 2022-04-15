package ru.netology.radio;

public class Radio {

    public static int currentStation;

    public static int getCurrentStation() {
        return currentStation;
    }

   static void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        Radio.currentStation = currentStation;
    }

   static int setNextStation(int nextStation) {
        nextStation = Radio.currentStation;
        if (currentStation == 9) {
            nextStation = 0;
        }
        return Radio.currentStation = nextStation + 1;
    }

    static int setPrevStation(int prevStation) {
            prevStation = Radio.currentStation;
            if (currentStation == 0) {
                prevStation = 9;
            }
            return Radio.currentStation = prevStation - 1;

        }

}


