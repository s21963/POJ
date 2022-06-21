import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame(){
        this.setSize(1200, 800);
        this.setResizable(true);
        this.setTitle("Tytuł ramki");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon("logo1.png");
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }
}
