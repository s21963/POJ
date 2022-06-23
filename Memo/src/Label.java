import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label extends JLabel {
/*
Label zabiera tyle miejsca ile to możliwe w danym kontenerze
 */
    int maxWidth = 100;
    int maxHeight = 100;

    Label(){

        ImageIcon labelImage = new ImageIcon(getClass().getResource("logo1.png"));  //pobiera plik i zapisuje do zmiennej
        //labelImage = resizeIcon(labelImage);
        labelImage.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        this.setText("Label text");
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 5);

//        this.setIcon(labelImage);



        this.setHorizontalTextPosition(JLabel.CENTER);   //JLabel.LEFT or RIGHT or CENTER
        this.setVerticalTextPosition(JLabel.TOP);   //JLabel.TOP or CENTER  or BOTTOM
        this.setForeground(Color.RED);    //Kolor czcionki
        this.setBackground(Color.BLACK);    //Kolor czcionki
        this.setOpaque(true); //Metoda zamalowuje cały background, każdy pixel, może być w różnych kontenerach
        this.setFont(new Font("", Font.PLAIN, 20));
        this.setIconTextGap(20);    //Gap between icon and text
        this.setBorder(border);

        this.setBounds(30, 30, 200, 50);   //koordynaty plus rozmiar, musi być wyłączony Layout Manager

    }

    public ImageIcon resizeIcon(ImageIcon icon){

        int newWidth = 1;
        int newHeight = 1;
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
