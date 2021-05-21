import greenfoot.*;
public class MainGame2 extends World
{
    public static int score = 0;
    public static int score2 = 0;
    public static int turtleAmt = 21;
    public MainGame2()
    {    
        super(1000, 700, 1);
        
        addObject( new Player2(), 50, 600 );
        addObject( new Home(), 950, 650 );
        //addObject( new Shark2(), 850, 100 );
        
                
        addObject( new Thing(), 200, 650);
        addObject( new Thing(), 200, 560);
        addObject( new Thing(), 200, 470);
        addObject( new Thing(), 200, 380);
        addObject( new Thing(), 200, 290);
        addObject( new Thing(), 200, 200);
        
        //addObject( new Thing(), 500, 650);
        //addObject( new Thing(), 500, 560);
        addObject( new Thing(), 500, 470);
        addObject( new Thing(), 500, 380);
        addObject( new Thing(), 500, 290);
        addObject( new Thing(), 500, 200);
        addObject( new Thing(), 500, 110);
        addObject( new Thing(), 500, 20);
        
        addObject( new Thing(), 800, 650);
        addObject( new Thing(), 800, 560);
        addObject( new Thing(), 800, 470);
        addObject( new Thing(), 800, 380);
        addObject( new Thing(), 800, 290);
        addObject( new Thing(), 800, 200);
        
        
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
        //showText("turtles Lost: " + score2, 89, 45);
    }
    private void Awake()
    {
       score = 0;
       score2 = 0;
    }
}
