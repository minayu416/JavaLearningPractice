public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        // 0,0
        return Math.sqrt((-getX()) * (-getX()) + (-getY()) * (-getY()));
    }

    public double distance(int x, int y){
        return Math.sqrt((getX()-x) * (getX()-x) + (getY()-y) * (getY()-y));

    }

    public double distance(Point p){
        return Math.sqrt((getX()-p.getX()) * (getX()-p.getX()) + (getY()-p.getY()) * (getY()-p.getY()));

    }

}
