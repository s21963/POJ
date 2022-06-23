import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

        int x, y, width, height;


        public Button(int x, int y, int width, int height){
            this.setBounds(x, y, width, height);
            this.setText("I'm a button");
            this.setFocusable(false);
            this.setLayout(null);



        }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
    }

}
