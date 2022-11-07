package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void detect1996AsTypicalLeapYear() {
        assertTrue(LeapYear.isLeap(1996));
    }

    @Test
    public void detect1992AsTypicalLeapYear() {
        assertTrue(LeapYear.isLeap(1992));
    }

    @Test
    public void detect2001AsTypicalCommonYear() {
        assertFalse(LeapYear.isLeap(2001));
    }

    @Test
    public void detect1900AsAtypicalCommonYear() {
        assertFalse(LeapYear.isLeap(1900));
    }

    @Test
    public void detect2000AsAtypicalLeapYear() {
        assertTrue(LeapYear.isLeap(2000));
    }

    @ParameterizedTest
    @ValueSource(ints = {1988, 2004, 2008})
    public void detectTypicalLeapYears(int year) {
        assertTrue(LeapYear.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1991, 1995, 2003})
    public void detectTypicalCommonYears(int year) {
        assertFalse(LeapYear.isLeap(year));
    }

}
