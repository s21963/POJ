import javax.swing.*;
import java.awt.*;

public class MemoButton extends JButton {

        private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "R", "S"};

        public MemoButton(){
                this.setHorizontalAlignment(JButton.CENTER);
                this.setVerticalAlignment(JButton.CENTER);
                this.setFont(new Font("", Font.BOLD, 25));
                this.setForeground(Color.BLACK);
                this.setBackground(Color.LIGHT_GRAY);
//                this.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
                this.setEnabled(true);    // można wyłączyć przycisk
        }
}
