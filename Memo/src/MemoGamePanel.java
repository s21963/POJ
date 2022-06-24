import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MemoGamePanel extends JPanel{

    private static int size = 6;
    private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "R", "S"};


    public MemoGamePanel(){
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(100, 100));
        this.setLayout(new GridLayout(size,size,3, 3));
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));

//----------------------       Randomize Array      ------------------------------------
        Random random = new Random();


//----------------------        add Buttons         ------------------------------------
        MemoButton[][] button = new MemoButton[size][size];
        MemoButton temp = new MemoButton();

        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                MemoButton tempButton = new MemoButton();
                button[i][j] = tempButton;
                this.add(button[i][j]);
            }
        }
    }
}
