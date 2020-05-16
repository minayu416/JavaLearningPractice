public class LeapYear {

    public static void main(String[] args){
        int year = 1924;
        boolean result = isLeapYear(year);

        System.out.println(result);
    }

    public static boolean isLeapYear (int year){
        if (year < 1 || year > 9999){
            return false;
        }

        if (year % 100 == 0){
            return (year % 400 == 0);
        }

        else if (year % 4 == 0){
            return true;

        }

        return false;

    }



}
