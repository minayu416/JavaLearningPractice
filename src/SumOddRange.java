public class SumOddRange {


    public static void main(String[] args) {
        System.out.println(sumOdd(-4,6));
    }

    public static boolean isOdd(int number){
        if (!(number>0)){
            return false;

        }
        if (number % 2 != 0){
            return true;
        }
        else {
            return false;

        }

    }


    public static int sumOdd(int start, int end){
        int number = 0;
        if (start>end || start<=0){
            return -1;
        }
        for (int i = start; i <=end; i++){
            if (isOdd(i)){
                number += i;
                //System.out.println(number);
            }
            else {
                ;
                //System.out.println(number);
            }
        }
        if (number<0){
            return -1;


        }
        else {
            return number;
        }

    }




}
