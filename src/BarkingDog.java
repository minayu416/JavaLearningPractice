public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        // boolean barking
        // int hourOfDay 0-23

        if (!barking){
            return false;

        }

        if (hourOfDay <0 || hourOfDay > 23){
            return false;
        }
        else if (hourOfDay < 8 || 22 < hourOfDay){
            return true;

        }
        else{

            return false;
        }

    }
}
