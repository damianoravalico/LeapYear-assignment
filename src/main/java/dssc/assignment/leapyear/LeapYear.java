package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) { // Only tests are performed, main is not used
    }

    private LeapYear() {
    }

    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

}
