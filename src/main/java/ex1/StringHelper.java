package ex1;

public class StringHelper {


    public static boolean isStringLong(String input) {

        if(input.length() > 5) {
            return true;
        }

        return false;
    }

    /*public static boolean isStringLong(String input) {

        return input.length() > 5;
    }*/
}
