package Classworks.AreaFigure;

public class Rectangular extends A_Figure{
    private Point a;
    private Point b;


    public Rectangular(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    int Area() {
        int side1 = a.getX()-b.getY();
        int side2 = a.getY()-b.getY();
        return side1*side2;
    }
}
