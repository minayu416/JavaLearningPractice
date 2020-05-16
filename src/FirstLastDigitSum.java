public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }


    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;


        }
        else {

            int first = 0;
            int last = 0;
            int value = number;
            int count = 1;
            int a = 0;
            int b = 0;
            while (value!=0){
                    first = value % 10;
                if (count==1){
                    a = first;

                }
                value/=10;
                if (value==0){
                    b= first;


                }
                count++;


            }
            return a+b;
        }



    }




}
