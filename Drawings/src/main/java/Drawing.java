import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private ArrayList<Shape> list1;

    //public Drawing(int i, Point point, Color black) {
    //}

    public Drawing(int radius, Point p, Color c) {
        list1 = new ArrayList<>();

        Circle circle1 = new Circle(radius, p, c);
        Rect rect1 = new Rect(p, radius, 10, c);
        Square square1 = new Square(p,radius,radius,c);
        list1.add(circle1);
        list1.add(rect1);
        list1.add(square1);


    }
    public void paint(Graphics object) {
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            list1.get(i).draw(object);
        }
    }
    //public void paint(Graphics g) {
        //g.setColor(Color.black);
        //g.drawLine(0, 0, 100, 100);
}

