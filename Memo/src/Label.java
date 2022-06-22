import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
/*
Label zabiera tyle miejsca ile to możliwe w danym kontenerze
 */
    int maxWidth = 100;
    int maxHeight = 100;

    Label(){

        ImageIcon labelImage = new ImageIcon(getClass().getResource("logo1.png"));  //pobiera plik i zapisuje do zmiennej
        labelImage = resizeIcon(labelImage);
        this.setText("Label text");

        this.setIcon(labelImage);

        this.setHorizontalTextPosition(JLabel.CENTER);   //JLabel.LEFT or RIGHT or CENTER
        this.setVerticalTextPosition(JLabel.TOP);   //JLabel.TOP or CENTER  or BOTTOM
        this.setForeground(Color.BLACK);    //Kolor czcionki
//        this.setBackground(Color.YELLOW);    //Kolor czcionki
//        this.setOpaque(true); //Metoda zamalowuje cały background, każdy pixel, może być w różnych kontenerach
        this.setFont(new Font("", Font.PLAIN, 50));
        this.setIconTextGap(20);    //Gap between icon and text

    }

    public ImageIcon resizeIcon(ImageIcon icon){

        int newWidth = 0;
        int newHeight = 0;
        int sourceWidth = icon.getIconWidth();
        int sourceHeight = icon.getIconHeight();

        if((sourceWidth/sourceHeight) >= (maxWidth/maxHeight)) {
            newWidth = maxWidth;
            newHeight = sourceHeight * (newWidth / sourceWidth);
        }
        else
        {
            newHeight = maxHeight;
            newWidth = sourceWidth * (newHeight / sourceHeight);
        }

        return new ImageIcon(icon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

    }
}
