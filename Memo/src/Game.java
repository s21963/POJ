import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Game {

    public static void main(String[] args) {

        //Tworzę ramkę JFrame
        Frame frame = new Frame();

        ImageIcon labelImage = new ImageIcon(getClass().getResource("img_flag.png"));

        JLabel label = new JLabel();
        label.setText("Label text");
        frame.add(label);
        label.setIcon(labelImage);




        frame.setVisible(true);

    }
}
