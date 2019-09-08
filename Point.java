public class Point {
    private int x; 
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int initialX , int initialY){
        x = initialX;
        y = initialY;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void display(){
        System.out.println("("+ x +", "+ y + ")");
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;

    }

    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    public double distance(Point other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "("+ x +", "+ y + ")";
    }
}