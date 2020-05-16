public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){

        if (minutes <0){
            System.out.println("Invalid Value");
        }
        else{
            long year = minutes / (60*24*365);
            long day = minutes / (60*24);
            System.out.println(year);
            System.out.println(day);
            System.out.println(minutes + " min = " + year + " y and "+ day + " d");

        }


    }







}
