public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //printMegaBytesAndKiloBytes
        //int kiloBytes = 2500;
        //int megabytes = kiloBytes / 1024 ;
        //int remainKiloBytes = kiloBytes % 1024;

        if (kiloBytes<0){

            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = "+ (kiloBytes / 1024) +" MB and " + (kiloBytes % 1024)+ " KB");

        }


    }


}
