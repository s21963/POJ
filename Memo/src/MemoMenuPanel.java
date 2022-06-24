import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoMenuPanel extends MemoGamePanel implements ActionListener {


    public JPanel scorePanel = new JPanel();
    public JPanel clickPanel = new JPanel();
    public static JLabel clickCard = new JLabel();
    public static JLabel scoreCard = new JLabel();


    public MemoMenuPanel(){
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(250, 100));
        this.setLayout(null);
        this.add(scorePanel);
        this.add(clickPanel);

        scorePanel.setBackground(Color.DARK_GRAY);
        scorePanel.setBounds(25, 100, 200, 100);
        scorePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        scorePanel.add(scoreCard);
        scoreCard.setFont(new Font("", Font.PLAIN, 20));
        scoreCard.setForeground(Color.white);
        scoreCard.setText("Twój wynik:: 0");

        clickPanel.setBackground(Color.DARK_GRAY);
        clickPanel.setBounds(25, 550, 200, 100);
        clickPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        clickPanel.add(clickCard);
        clickCard.setFont(new Font("", Font.PLAIN, 20));
        clickCard.setForeground(Color.white);
    }


}
