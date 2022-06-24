import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        ImageIcon logo = new ImageIcon(Game.class.getResource("logo1.png"));
        MemoGamePanel gamePanel = new MemoGamePanel();
        MemoMenuPanel menuPanel = new MemoMenuPanel();

        JFrame window = new JFrame();
        window.setSize(1200, 800);
        window.setResizable(true);
        window.setTitle("MEMO Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setIconImage(logo.getImage());
        window.getContentPane().setBackground(new Color(123, 50, 250));
        window.setLayout(new BorderLayout());
        window.add(gamePanel, BorderLayout.CENTER);
        window.add(menuPanel, BorderLayout.EAST);







            window.setVisible(true);
        }
    }


