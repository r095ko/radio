package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

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

    public int getNextStation() {
        return currentStation;
    }

    public void setNextStation(int currentStation) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }

        if (currentStation > 9) {
            currentStation = 0;
        }

        this.currentStation = currentStation;

    }

    public int getPrevStation() {
        return currentStation;
    }

    public void setPrevStation(int currentStation) {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }

        if (currentStation <= 0) {
            currentStation = 9;
        }

        this.currentStation = currentStation;

    }


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

    public int getIncreaseVolume() {
        return currentVolume;

    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;

    }

    public void setDecreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}