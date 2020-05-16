public class Hello {

    public static void main(String[] args){
        int result = calculateScore(true, 50, 5, 100);
        int result2 = calculateScore(true, 100, 7, 100);
        System.out.println(result);
        System.out.println(result2);
    }


    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        if (gameOver){
            //System.out.println(finalScore);
            return 1000+ score + (level*bonus);
        }
        return -1;
    }


}
