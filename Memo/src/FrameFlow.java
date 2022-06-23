import javax.swing.*;
import java.awt.*;

public class FrameFlow extends JFrame {

    FrameFlow() {
        this.setSize(1200, 800);
        this.setResizable(true);
        this.setTitle("Tytuł ramki");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 40));  //gapy pomiędzy buttonami

//To samo można zrobić dla Panelu
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("10"));




    }
}