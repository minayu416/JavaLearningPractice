public class DemoJava {

//     1. for loop
//     2. switch
//     3. overwrite
//     4. exception

    public static void main(String[] args) throws InterruptedException {
        // DemoJava demo = new DemoJava();
        int getIceCream = makeIceCream(60);
        System.out.println("Begin to make your ice cream");

//         for loop
//         init ; condition ; control variable
        for (int i = 0; i < getIceCream; i++) {
            // sleep() millisecond, python is second and using 0.1 to represent millis
            // int i = 1;
            System.out.println(i++);
            System.out.println(++i);
//            try {
            Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                loggr.error("xxxxxx");
//                throw ex;
//            }
            System.out.println("you get 1 ice cream!");
//        }

//         for ice_cream in len(getIceCream):
//             print(ice_cream)

            System.out.println("You Got: " + makeIceCream('S', 200) + " Ice Cream");


        }
    }

        // overwrite

        public static int makeIceCream ( int coin){
            if (coin < 0) {
                return -1;
            }
            int iceCream = 10;

            return (coin / iceCream);


        }

        public static String makeIceCream ( char favor, int coin){
            if (coin < 0) {
                return "You do not pay money";
            }
            int iceCreamPrice = 10;

            // switch
            switch (favor) {
                case 'S':
                    return "Strawberry " + (coin / iceCreamPrice);

                case 'C':
                    return "Chocolate " + (coin / iceCreamPrice);

                case 'O':
                    return "Orange " + (coin / iceCreamPrice);

                default:
                    return "We do not have favor you want!";

//             {"S": "Strawberry",
//              "C": "Chocolate",
//              "O": "Orange",}

            }


        }


    }
