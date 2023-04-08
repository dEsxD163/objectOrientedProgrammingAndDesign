package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio cond = new Radio();

    @Test
    public void test() {
        Radio cond = new Radio(10);
        Assertions.assertEquals(10, cond.getQuantityRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {

        cond.setCurrentRadioStation(5);

        int expected = 5;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {

        cond.setCurrentRadioStation(10);

        int expected = cond.getMinRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {

        cond.setCurrentRadioStation(-1);

        int expected = cond.getMinRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {

        cond.setToMaxRadioStation();

        int expected = cond.getMaxRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {

        cond.setToMinRadioStation();

        int expected = cond.getMinRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStation() {

        cond.setCurrentRadioStation(cond.getMinRadioStation());

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationNumber0() {

        cond.setCurrentRadioStation(cond.getMaxRadioStation());

        cond.SwitchingNextRadioStation();

        int expected = cond.getMinRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationAboveMax() {

        cond.setCurrentRadioStation(20);

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextRadioStationBelowMin() {

        cond.setCurrentRadioStation(-20);

        cond.SwitchingNextRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStation() {

        cond.setCurrentRadioStation(7);

        cond.SwitchingPrevRadioStation();

        int expected = 6;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationNumber9() {

        cond.setCurrentRadioStation(cond.getMinRadioStation());

        cond.SwitchingPrevRadioStation();

        int expected = cond.getMaxRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationAboveMax() {

        cond.setCurrentRadioStation(20);

        cond.SwitchingPrevRadioStation();

        int expected = cond.getMaxRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevRadioStationBelowMin() {

        cond.setCurrentRadioStation(-20);

        cond.SwitchingPrevRadioStation();

        int expected = cond.getMaxRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // currentVolumeLevel
    @Test
    public void shouldSetVolumeLevel() {

        cond.setCurrentVolumeLevel(5);

        int expected = 5;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLevelAboveMax() {

        cond.setCurrentVolumeLevel(101);

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLevelBelowMin() {

        cond.setCurrentVolumeLevel(-10);

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolumeLevel() {

        cond.setToMaxVolumeLevel();

        int expected = cond.getMaxVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolumeLevel() {

        cond.setToMinVolumeLevel();

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevel() {

        cond.setCurrentVolumeLevel(50);

        cond.SwitchingNextVolumeLevel();

        int expected = 51;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atTheMaxVolumeLevelSwitchingForwardDoesNothing() {

        cond.setCurrentVolumeLevel(cond.getMaxVolumeLevel());

        cond.SwitchingNextVolumeLevel();

        int expected = cond.getMaxVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevelAboveMax() {

        cond.setCurrentVolumeLevel(200);

        cond.SwitchingNextVolumeLevel();

        int expected = 1;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextVolumeLevelBelowMin() {

        cond.setCurrentVolumeLevel(-20);

        cond.SwitchingNextVolumeLevel();

        int expected = 1;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevel() {

        cond.setCurrentVolumeLevel(50);

        cond.SwitchingPrevVolumeLevel();

        int expected = 49;
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void atTheMinVolumeLevelSwitchingForwardDoesNothing() {

        cond.setCurrentVolumeLevel(cond.getMinVolumeLevel());

        cond.SwitchingPrevVolumeLevel();

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevelAboveMax() {

        cond.setCurrentVolumeLevel(200);

        cond.SwitchingPrevVolumeLevel();

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevVolumeLevelBelowMin() {

        cond.setCurrentVolumeLevel(-20);

        cond.SwitchingPrevVolumeLevel();

        int expected = cond.getMinVolumeLevel();
        int actual = cond.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}