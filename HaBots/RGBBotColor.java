import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.Desktop;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

//Jenky bot idea, might use it top open a image then click on the exact rgb (might go wrong as hell)
//Desktop dt=Desktop.getDesktop();
//dt.open(file);


public class RGBBotColor {
    public static Color[][] loadPixelsFromImage(File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        Color[][] colors = new Color[image.getWidth()][image.getHeight()];

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                colors[x][y] = new Color(image.getRGB(x, y));
            }
        }

        return colors;
    }

    public static void main(String[] args) throws IOException {
        Color[][] colors = loadPixelsFromImage(new File("image.png"));
        
        for(int i=0;i<100;i++){
            System.out.println("Color[0][0] = " + colors[i][i]);
        }
    }
    
    
}