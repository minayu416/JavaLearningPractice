public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int a, int b){
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            int first = 0;

            while (a != 0) {
                first = a % 10;

                int temp = b;
                int compare = 0;
                while (temp != 0) {
                    compare = temp % 10;

                    if (first == compare) {
                        return true;
                    }

                    temp /= 10;

                }
                a /= 10;


            }

        }
        return false;


    }




}
