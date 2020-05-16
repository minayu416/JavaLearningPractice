public class TeenNumberChecker {

    public static boolean hasTeen(int age1, int age2, int age3){
        if (age1 >=13 && age1 <= 19){
            return true;
        }

        else if (age2 >=13 && age2 <= 19) {
            return true;
        }

        return (age3 >=13 && age3 <= 19);


    }


    public static boolean isTeen(int age){
        return (age >=13 && age <= 19);


    }


}
