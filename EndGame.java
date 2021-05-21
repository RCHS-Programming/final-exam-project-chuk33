import greenfoot.*;

public class EndGame extends World
{
   MainGame mainGame;
   public EndGame()
   {    
        super(1000, 700, 1);
        
        GreenfootImage image = new GreenfootImage("Congrats! you've officially wasted your time", 50, Color.WHITE, null);
        getBackground().drawImage(image, 500-image.getWidth()/2, 100-image.getHeight()/2);
        
        GreenfootImage image2 = new GreenfootImage("", 20, Color.WHITE, null);
        getBackground().drawImage(image2, 500-image.getWidth()/2, 200-image.getHeight()/2);
        
        showText("YOUR SCORE: " + (mainGame.score + 21),500, 550);
   }
   public void act()
   {
       if (Greenfoot.isKeyDown("enter"))
       {
           Greenfoot.setWorld(new MainGame());
       }
   }
}
