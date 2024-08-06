package constants;

public class Constant {
    public static class TimeoutVariable{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 5;

        //clear browser cookies after each iteration
        public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

        //to keep the browser open after suite
        public static final Boolean HOLD_BROWSER_OPEN = true;
    }
}