import greenfoot.*;
public class MainGame extends World
{
    public static int score = 0;
    public static int score2 = 0;
    public static int turtleAmt = 21;
    public MainGame()
    {    
        super(1000, 700, 1);
        
        addObject( new Player(), 50, 600 );
        addObject( new Home(), 950, 650 );
        addObject( new Shark(), 850, 100 );
        
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        addObject( new Turtle(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(700));
        Awake();
    }
    public void act()
    {
        showText("turtles Saved: " + score, 80, 25);
        showText("turtles Lost: " + score2, 89, 45);
    }
    private void Awake()
    {
       score = 0;
       score2 = 0;
    }
}
