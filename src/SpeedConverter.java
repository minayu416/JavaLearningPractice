public class SpeedConverter {

    public static void main(String[] args){
        double num = 1.5;
        double num2 = 10.25;
        double num3 = -5.6;
        double num4 = 25.42;
        double num5 = 75.114;
        // long result = toMilesPerHour(num);
        System.out.println(toMilesPerHour(num));
        //long result2 = toMilesPerHour(num2);
        System.out.println(toMilesPerHour(num2));
        //long result2 = toMilesPerHour(num2);
        System.out.println(toMilesPerHour(num3));
        System.out.println(toMilesPerHour(num4));
        System.out.println(toMilesPerHour(num5));
    }


    public static long toMilesPerHour(double kilometerPerHour){
        // double kilometerPerHour = 0f;
        if (kilometerPerHour<0){
            return -1;
        }

        return Math.round(kilometerPerHour / 1.609);
    }



}
