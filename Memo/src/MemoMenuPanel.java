import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoMenuPanel extends MemoGamePanel implements ActionListener {


    public JPanel scorePanel = new JPanel();
    public JLabel scoreCard = new JLabel();



    public MemoMenuPanel(){
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(250, 100));
        this.setLayout(null);
        this.add(scorePanel);
        scorePanel.setBackground(Color.DARK_GRAY);
        scorePanel.setBounds(25, 350, 200, 300);
        scorePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        scorePanel.add(scoreCard);
        scoreCard.setText("Text score");
        scoreCard.setFont(new Font("", Font.PLAIN, 20));
        scoreCard.setForeground(Color.white);
    }

    public void addAction(){
        scoreCard.addAncestorListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        scoreCard.setText("Click count: \n" + clickCount);
    }
}
