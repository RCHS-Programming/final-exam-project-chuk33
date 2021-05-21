import greenfoot.*;

public class StartScreen extends World
{
   public StartScreen()
   {    
        super(1000, 700, 1);
        GreenfootImage image = new GreenfootImage("Ultra Realistic Underwater Turtle Rescuing Simulator", 50, Color.WHITE, null);
        getBackground().drawImage(image, 500-image.getWidth()/2, 150-image.getHeight()/2);
        showText("PRESS ENTER", 500, 550);
        
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
   }
   public void act()
   {
       if (Greenfoot.isKeyDown("enter"))
       {
           Greenfoot.setWorld(new MainGame());
       }
   }
}
