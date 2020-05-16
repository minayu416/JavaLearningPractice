public class FlourPacker {

     // TODO 看解答

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }

    public static boolean canPackSolution(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if ((bigCount * 5) <= goal) {
            return ((goal-(bigCount*5)) <= smallCount);
        }

        return ((goal % 5) <= smallCount);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount >=0 && smallCount>=0 && goal>=0){
            if (goal >= (bigCount*5)){
                return (goal - (bigCount*5)) <=smallCount;

            }

            return (goal %5) <= smallCount;



        }
        return false;

    }

//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if (bigCount >=0 && smallCount>=0 && goal>=0){
//
//            if ((bigCount * 5) + smallCount>=goal){
//
//                if ((bigCount * 5) + smallCount==goal){
//                    return true;
//                }
//
//                if (smallCount==0){
//                    return (bigCount * 5) ==goal;
//
//                }
//                if (bigCount>0){
//                    goal = goal - bigCount*5;
//                    if (goal<0){
//                        return false;
//
//                    }
//                    return (smallCount >= goal);
//
//
//                }
//            return (smallCount >= goal);
//
//
//            }
//
//
//
//        }
//        return false;
//
//    }



}
