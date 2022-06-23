import javax.swing.*;
import java.awt.*;

/*
JPanel funkcjonuje jako kontener na inne elementy
 */

public class Panel extends JPanel {

    Color color = new Color(0, 0, 0);
    int x, y, width, height;

    public Panel(Color color, int x, int y, int width, int height){

        this.setBounds(x, y, width, height);
        this.setBackground(color);
    }


}
