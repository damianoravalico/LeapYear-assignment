package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {1988, 1992, 1996, 2004, 2008})
    public void detectTypicalLeapYears(int year) {
        assertTrue(LeapYear.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1991, 1995, 2001, 2003, 2005})
    public void detectTypicalCommonYears(int year) {
        assertFalse(LeapYear.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000})
    public void detectAtypicalLeapYear(int year) {
        assertTrue(LeapYear.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900})
    public void detectAtypicalCommonYears(int year) {
        assertFalse(LeapYear.isLeap(year));
    }

}
