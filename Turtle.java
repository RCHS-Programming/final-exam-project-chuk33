import greenfoot.*;

public class Turtle extends Actor
{
    public void act() 
    {
        move(1);
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            turn(Greenfoot.getRandomNumber(90));
        }
    }    
}
