import javax.swing.*;
import java.awt.*;

public class MyIcon extends ImageIcon {

    private Image sourceFile;

    private int maxWidth = 20;
    private int maxHeight = 20;

    private int sourceWidth = 0;
    private int sourceHeight = 0;

    private int newWidth = 0;
    private int newHeight = 0;

    public MyIcon(Image sourceFile){
        this.sourceFile = sourceFile;
    }


    public MyIcon resizeIcon(MyIcon icon){
        sourceWidth = icon.getIconWidth();
        sourceHeight = icon.getIconHeight();

        if((sourceWidth/sourceHeight) >= (maxWidth/maxHeight)) {
            newWidth = maxWidth;
            newHeight = sourceHeight * (newWidth / sourceWidth);
        }
        else
        {
            newHeight = maxHeight;
            newWidth = sourceWidth * (newHeight / sourceHeight);
        }



        return new MyIcon(icon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

    }


}
