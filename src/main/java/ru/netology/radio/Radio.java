package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int quantityStation = 10;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > quantityStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getNextStation() {
        return currentStation;
    }

    public void setNextStation(int currentStation) {
        if (currentStation < quantityStation) {
            currentStation = currentStation + 1;
        }

        if (currentStation >= quantityStation) {
            currentStation = 0;
        }

        this.currentStation = currentStation;

    }

    public int getPrevStation() {
        return currentStation;
    }

    public void setPrevStation(int currentStation) {
        if (currentStation <= quantityStation) {
            currentStation = currentStation - 1;
        }

        if (currentStation <= 0) {
            currentStation = quantityStation - 1;
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
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;

    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
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