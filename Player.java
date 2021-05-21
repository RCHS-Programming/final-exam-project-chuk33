import greenfoot.*;

public class Player extends Actor
{
    MainGame mainGame;
    public void act() 
    {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX() - 5, getY() );
            //getImage().mirrorHorizontally();
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX(), getY() + 5 );
        }
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
            //getImage().mirrorHorizontally();
        }
        //onCollisionEnter
        if (isTouching(Shark.class) )
        {
            setLocation(50,600);
            Greenfoot.stop();
        }
        if (isTouching(Turtle.class) )
        {
            removeTouching(Turtle.class);
            mainGame.score++;
            mainGame.turtleAmt--;
        }
        if (isTouching(Home.class))
        {
            if (mainGame.score > mainGame.score2)
            {
                Greenfoot.setWorld(new MainGame2());
            }
            else
            {
                Greenfoot.stop();
            }
        }
    }
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX(), getY() + 5);
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX() - 5 , getY() );
        }
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
    }
}
