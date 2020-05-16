public class DecimalComparator {

    public static void main(String[] args){

        boolean c = areEqualByThreeDecimalPlaces(3.176, 3.175);
        System.out.println(c);



    }


    // TODO 這題參考答案才過 qq
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        return (int) (a * 1000) == (int) (b * 1000);


    }





}
