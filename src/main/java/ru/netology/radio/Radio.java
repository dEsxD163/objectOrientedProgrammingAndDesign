package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeLevel;
    private int quantityRadioStation = 10;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;

    public Radio() {
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > quantityRadioStation - 1) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel > maxVolumeLevel) {
            return;
        }
        if (newCurrentVolumeLevel < minVolumeLevel) {
            return;
        }
        currentVolumeLevel = newCurrentVolumeLevel;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = minRadioStation;
    }

    public void SwitchingNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }


    public void SwitchingPrevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setToMaxVolumeLevel() {
        currentVolumeLevel = maxVolumeLevel;
    }

    public void setToMinVolumeLevel() {
        currentVolumeLevel = minVolumeLevel;
    }

    public void SwitchingNextVolumeLevel() {
        if (currentVolumeLevel == maxVolumeLevel) {
            currentVolumeLevel = maxVolumeLevel;
        } else {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
    }

    public void SwitchingPrevVolumeLevel() {
        if (currentVolumeLevel == minVolumeLevel) {
            currentVolumeLevel = minVolumeLevel;
        } else {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
    }
}