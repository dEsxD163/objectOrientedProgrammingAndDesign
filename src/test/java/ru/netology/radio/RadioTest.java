package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(5);

        int expected = 5;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio cond = new Radio();

        cond.setToMaxRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio cond = new Radio();

        cond.setToMinRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStation() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationNumber0() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(9);

        cond.SwitchingNextRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(20);

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-20);

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStation() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(7);

        cond.SwitchingPrevRadioStation();

        int expected = 6;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationNumber9() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);

        cond.SwitchingPrevRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(20);

        cond.SwitchingPrevRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-20);

        cond.SwitchingPrevRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // currentVolumeLevel
    @Test
    public void shouldSetVolumeLevel() {
        Radio cond = new Radio();

        cond.setCurrentVolumeLevel(5);

        int expected = 5;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLevelAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentVolumeLevel(101);

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLevelBelowMin() {
        Radio cond = new Radio();

        cond.setCurrentVolumeLevel(-10);

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolumeLevel() {
        Radio cond = new Radio();

        cond.setToMaxVolumeLevel();

        int expected = 100;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolumeLevel() {
        Radio cond = new Radio();

        cond.setToMinVolumeLevel();

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevel() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(50);

        cond.SwitchingNextVolumeLevel();

        int expected = 51;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atTheMaxVolumeLevelSwitchingForwardDoesNothing() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(100);

        cond.SwitchingNextVolumeLevel();

        int expected = 100;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevelAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(200);

        cond.SwitchingNextVolumeLevel();

        int expected = 1;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevelBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(-20);

        cond.SwitchingNextVolumeLevel();

        int expected = 1;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevel() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(50);

        cond.SwitchingPrevVolumeLevel();

        int expected = 49;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atTheMinVolumeLevelSwitchingForwardDoesNothing() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(0);

        cond.SwitchingPrevVolumeLevel();

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevelAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(200);

        cond.SwitchingPrevVolumeLevel();

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevelBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentVolumeLevel(-20);

        cond.SwitchingPrevVolumeLevel();

        int expected = 0;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}
