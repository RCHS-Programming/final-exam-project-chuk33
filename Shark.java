import greenfoot.*;

public class Shark extends Actor
{
    MainGame mainGame;
    public Shark()
    {
        GreenfootImage Shark = getImage();
        Shark.scale(Shark.getWidth() + 200, Shark.getHeight() + 200);
        setImage(Shark);
    }
    public void act() 
    {
        move(5);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
        //onCollisionEnter
        if (isTouching(Turtle.class) )
        {
            removeTouching(Turtle.class);
            mainGame.score2++;
            mainGame.turtleAmt--;
        }
    }
}
