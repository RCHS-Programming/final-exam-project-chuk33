import greenfoot.*;

public class Home extends Actor
{
    public Home()
    {
        GreenfootImage Cave = getImage();
        Cave.scale(Cave.getWidth() - 370, Cave.getHeight() - 250);
        setImage(Cave);
    }
}
