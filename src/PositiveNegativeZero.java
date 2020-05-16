public class PositiveNegativeZero {


    public static void main (String[] args){
        int myNum = 1;
        checkNumber(myNum);

        int secondNum = 0;
        checkNumber(secondNum);


        int thirdNum = -122;
        checkNumber(thirdNum);
    }


    public static void checkNumber(int myNum){
        if (myNum>0){
            System.out.println("positive");
        }
        else if (myNum<0){
            System.out.println("negative");

        }
        else{
            System.out.println("Zero!");

        }

    }


}
