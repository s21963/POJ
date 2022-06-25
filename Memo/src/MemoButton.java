import javax.swing.*;
import java.awt.*;

public class MemoButton extends JButton {

        public MemoButton(){
                this.setHorizontalAlignment(JButton.CENTER);
                this.setVerticalAlignment(JButton.CENTER);
                this.setFont(new Font("", Font.BOLD, 25));
                this.setForeground(Color.BLACK);
                this.setBackground(Color.LIGHT_GRAY);
                this.setEnabled(true);    // można wyłączyć przycisk
        }
}
