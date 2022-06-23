import javax.swing.*;
import java.awt.*;

public class FrameGrid extends JFrame {

    FrameGrid() {
        this.setSize(1200, 800);
        this.setResizable(true);
        this.setTitle("Tytuł ramki");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,4, 5, 5));

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
        this.add(new JButton("11"));
        this.add(new JButton("12"));
        this.add(new JButton("13"));
        this.add(new JButton("14"));
        this.add(new JButton("15"));
        this.add(new JButton("16"));

    }
}