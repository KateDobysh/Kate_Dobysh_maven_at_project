package DayOfWeekUtility;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;

public class DayOfWeekUtilityTest {

    @Test
    public void testGetDayOfWeekNextYearMethod() {
        int plusYears = 1;
        LocalDateTime ldt = LocalDateTime.now().plusYears(plusYears);
        int year = ldt.getYear();
        int dayNumber = ldt.getDayOfWeek().getValue();
        String expectedDay = getDayOfWeek(dayNumber);

        Assert.assertEquals(expectedDay, DayOfWeekUtility.getDayOfWeekNextYear(plusYears));
    }

    public static String getDayOfWeek(int dayNumber) {

        if (dayNumber >= 1 && dayNumber <= 7) {
            return switch (dayNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day number";
            };
        }

        return "Invalid day number. Please provide a number between 1 and 7.";
    }

//    @Test
//    public void testGetDayOfWeekMethod() {
//        Assert.assertEquals("Monday", DayOfWeekUtility.getDayOfWeek(1));
//        Assert.assertEquals("Invalid day number. Please provide a number between 1 and 7.", DayOfWeekUtility.getDayOfWeek(0));
//    }
//
//    @Test
//    public void testIfYearMetYes(){
//        Assert.assertEquals("Wednesday", DayOfWeekUtility.getDayOfWeekNextYear(10));
//    }
//    @Test
//    public void testIfYearMetYesAndDayNumberSixOrSeven(){
//
//    }
}