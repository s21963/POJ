import javax.swing.*;
import java.awt.*;

public class MemoMenuPanel extends JPanel {


    private JPanel scorePanel = new JPanel();



    public MemoMenuPanel(){
        this.setBackground(Color.GREEN);
        this.setPreferredSize(new Dimension(250, 100));
        this.setLayout(null);
        this.add(scorePanel);
        scorePanel.setBackground(Color.DARK_GRAY);
        scorePanel.setBounds(25, 350, 200, 300);
        scorePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));


    }

}
