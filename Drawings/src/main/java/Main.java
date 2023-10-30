import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {                // A class called Main
    public static void main(String[] args) {
        Point point= new Point(300, 300);
        Color col=new Color(45,87,34);
        Frame frame=new Frame("Mal");
        Drawing drawing = new Drawing(100, point, col);
        //Drawing2 drawing = new Drawing2();

        frame.add(drawing);
        drawing.setSize(1000, 1000);
        drawing.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}