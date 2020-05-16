public class NumberPalindrome {


    public static void main(String[] args) {

        System.out.println(isPalindrome(11));
    }


    public static boolean isPalindrome(int number){

        int save = 0;
        int reverse = 0;
        int remove = number;

        while (remove!=0){
            // 取後面數字
            save = remove % 10;

            // 累積數字
            reverse = reverse * 10 + save;

            // 截掉後面的數字
            remove /= 10;

        }

        return number == reverse;
    }


}
