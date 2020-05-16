public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;



        }
        else{
            int first = 0;
            //int count = 1;
            int sum = 0;
            while (number!=0){
                first = number % 10;
                if (first % 2 ==0){
                    sum +=first;
                }
                //count+=1;
                number /=10;

            }
            return sum;



        }


    }



}
