package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void is1996TypicalLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeap(1996));
    }

}
