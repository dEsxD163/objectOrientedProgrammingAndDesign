package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolumeLevel;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel > 100) {
            return;
        }
        if (newCurrentVolumeLevel < 0) {
            return;
        }
        currentVolumeLevel = newCurrentVolumeLevel;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void SwitchingNextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }


    public void SwitchingPrevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setToMaxVolumeLevel() {
        currentVolumeLevel = 100;
    }

    public void setToMinVolumeLevel() {
        currentVolumeLevel = 0;
    }

    public void SwitchingNextVolumeLevel() {
        if (currentVolumeLevel == 100) {
            currentVolumeLevel = 100;
        } else {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
    }

    public void SwitchingPrevVolumeLevel() {
        if (currentVolumeLevel == 0) {
            currentVolumeLevel = 0;
        } else {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
    }
}

