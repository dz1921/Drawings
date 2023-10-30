import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstTest {                // A class called Main
    public static void FirstTest(String[] args) {
        Frame frame=new Frame("Maluvka");
        Drawing drawing = new Drawing();
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