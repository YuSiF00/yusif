package Classworks.AreaFigure;

import java.util.Comparator;

public class GeoApp {
    public static void main(String[] args) {

        Point point1 = new Point(12, 12);
        Point point2 = new Point(7,7);
        Rectangular rectangular = new Rectangular(point1,point2);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(rectangular.Area());
        System.out.println(circle.Area());
        System.out.println(triangle.Area());

        System.out.println("-----------------------------------");

        Comparator<A_Figure> comparator= new Comparator<A_Figure>() {
            @Override
            public int compare(A_Figure o1, A_Figure o2) {
                return o1.Area()-o2.Area();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };


        //Collections.sort();
        //comparator.compare(circle,triangle);
    }
}
