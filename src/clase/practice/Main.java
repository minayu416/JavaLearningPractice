package clase.practice;

public class Main {

    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Porsche");
        holden.setModel("Holden");
        System.out.println(porsche);
        System.out.println(porsche.getModel());
        System.out.println(holden);
        System.out.println(holden.getModel());


    }


}
