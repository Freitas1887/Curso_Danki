import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Spritesheet {

    public static  BufferedImage spritesheet;
    public static BufferedImage player_font;
    public static BufferedImage tileWall;

    public Spritesheet(){
        try{
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        player_font = Spritesheet.getSprite(0, 11, 16, 16);
        tileWall = Spritesheet.getSprite(307, 154, 16, 16);

    }

    public static BufferedImage getSprite(int x, int y, int width, int height){
       return spritesheet.getSubimage(x, y, width, height);
    }


}
