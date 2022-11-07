package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void is1996TypicalLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeap(1996));
    }

    @Test
    public void is1992TypicalLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeap(1992));
    }

}
