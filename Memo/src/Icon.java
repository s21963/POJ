import javax.swing.*;

public class Icon extends ImageIcon {

    private String sourceFile;

    private int requiredWidth = 20;
    private int requiredHeight = 20;

    private int sourceWidth;
    private int sourceHeight;

    private int newWidth;
    private int newHeight;

    public Icon resizeIcon(Icon icon, int width, int height){
        sourceWidth = icon.getIconWidth();
        sourceHeight = icon.getIconHeight();

        if(sourceWidth > requiredWidth){
            newWidth = requiredWidth;
            newHeight = sourceHeight * (newWidth / sourceWidth);
        }

        if(sourceHeight > requiredHeight){
            newHeight = requiredHeight;
            newWidth = sourceWidth * (newHeight / sourceHeight);
        }


        return new Icon;
    }


}
