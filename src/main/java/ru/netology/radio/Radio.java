package ru.netology.radio;

public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int nextStation;

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        if (nextStation < 9) {
            nextStation = nextStation + 1;
        }

        if (nextStation > 9) {
            nextStation = 0;
        }

        this.nextStation = nextStation;

    }

    public int prevStation;

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (prevStation <= 9) {
            prevStation = prevStation - 1;
        }

        if (prevStation <= 0) {
            prevStation = 9;
        }

        this.prevStation = prevStation;

    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume;

    public int getIncreaseVolume() {
        return increaseVolume;

    }

    public void setIncreaseVolume(int increaseVolume) {
        if (increaseVolume < 10) {
            increaseVolume = increaseVolume + 1;
        }
        if (increaseVolume >= 10) {
            increaseVolume = 10;
        }
        this.increaseVolume = increaseVolume;
    }

    public int decreaseVolume;

    public int getDecreaseVolume() {
        return decreaseVolume;

    }

    public void setDecreaseVolume(int decreaseVolume) {
        if (decreaseVolume > 0) {
            decreaseVolume = decreaseVolume - 1;
        }
        if (decreaseVolume == 0) {
            return;
        }
        this.decreaseVolume = decreaseVolume;
    }
}
