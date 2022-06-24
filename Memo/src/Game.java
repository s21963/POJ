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

        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "R", "S"};
        int j = 1;
        int[] lettersRandom = new int[2 * letters.length];
        lettersRandom[0] = 0;
        for (int i = -(letters.length) + 1; i < letters.length; i++, j++) {
            lettersRandom[j] = i;
            System.out.println(lettersRandom[j]);
        }


        Random generator = new Random();
        for (int i = (lettersRandom.length - 1); i >= 0; i--) {
            int randomNumber = generator.nextInt(i + 1);
            int temp = lettersRandom[i];
            lettersRandom[i] = lettersRandom[randomNumber];
            lettersRandom[randomNumber] = temp;
            System.out.println(lettersRandom[i]);


//        System.out.println("letters length = " + lettersRandom.length);


            window.setVisible(true);
        }
    }
}

