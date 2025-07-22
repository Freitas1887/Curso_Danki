import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Spritesheet {

    public static  BufferedImage spritesheet;
    public static BufferedImage[] player_font;
    public static BufferedImage tileWall;
    public static BufferedImage[] inimigo_font;

    public Spritesheet(){
        try{
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        player_font = new BufferedImage[2];
        inimigo_font = new BufferedImage[2];


        player_font[0] = Spritesheet.getSprite(0,11, 16, 16);
        player_font[1] = Spritesheet.getSprite(16, 11, 16, 16);

        inimigo_font[0] = Spritesheet.getSprite(307,186, 16, 16);
        inimigo_font[1] = Spritesheet.getSprite(324, 186, 16, 16);

        tileWall = Spritesheet.getSprite(307, 154, 16, 16);

    }

    public static BufferedImage getSprite(int x, int y, int width, int height){
       return spritesheet.getSubimage(x, y, width, height);
    }


}
