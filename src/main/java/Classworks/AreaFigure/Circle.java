package Classworks.AreaFigure;

public class Circle extends A_Figure{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    int Area() {

        return (int) (Math.PI*radius*radius);

    }
}
