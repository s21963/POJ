import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
/*
Label zabiera tyle miejsca ile to możliwe w danym kontenerze
 */
    Label(){

        ImageIcon labelImage = new ImageIcon(getClass().getResource("logo1.png"));  //pobiera plik i zapisuje do zmiennej
        this.setText("Label text");
//        this.setIcon(labelImage);

        this.setHorizontalTextPosition(JLabel.CENTER);   //JLabel.LEFT or RIGHT or CENTER
        this.setVerticalTextPosition(JLabel.TOP);   //JLabel.TOP or CENTER  or BOTTOM
        this.setForeground(Color.BLACK);    //Kolor czcionki
//        this.setBackground(Color.YELLOW);    //Kolor czcionki
//        this.setOpaque(true); //Metoda zamalowuje cały background, każdy pixel, może być w różnych kontenerach
        this.setFont(new Font("", Font.PLAIN, 50));
        this.setIconTextGap(20);    //Gap between icon and text

    }
}
