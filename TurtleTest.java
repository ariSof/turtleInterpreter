/**
JUnit test used to test Turtle class that is used by interpreter
Tested move command in x direction, in y direction, tested moving in a 45 degree angle
And using a combination of commands to have turtle move in a square returning to 
the same location it began.
 */

import org.junit.Assert;
import org.junit.Test;

public class TurtleTest {
     @Test
    public void moveTest(){
        //Arrange
        Turtle aTurtle = new Turtle();

        //Act
        aTurtle.move(10);

        //Assert
        double xPos = aTurtle.getDistanceX();
        double yPos = aTurtle.getDistanceY();
        Assert.assertEquals(10.0, xPos,.01);
        Assert.assertEquals(0.0, yPos,.01);
    }

    @Test
    public void moveYTest(){
        //Arrange
        Turtle aTurtle = new Turtle();
        aTurtle.turn(90);

        //Act
        aTurtle.move(10);

        //Assert
        double xPos = aTurtle.getDistanceX();
        double yPos = aTurtle.getDistanceY();
        Assert.assertEquals(0.0, xPos,.01);
        Assert.assertEquals(10.0, yPos,.01);
    }

    @Test
    public void turnTest(){
        //Arrange
        Turtle aTurtle = new Turtle();

        //Act
        aTurtle.turn(45);
        aTurtle.move(10);

        //Assert
        double xPos = aTurtle.getDistanceX();
        double yPos = aTurtle.getDistanceY();
        Assert.assertEquals(7.071, xPos,.01);
        Assert.assertEquals(7.071, yPos,.01);
    }

    @Test
    public void testSquare(){
        //Arrange
        Turtle aTurtle = new Turtle();

        //Act
        aTurtle.move(10);
        aTurtle.turn(90);
        aTurtle.move(10);
        aTurtle.turn(90);
        aTurtle.move(10);
        aTurtle.turn(90);
        aTurtle.move(10);
        

        //Assert
        double xPos = aTurtle.getDistanceX();
        double yPos = aTurtle.getDistanceY();
        double hDegrees = aTurtle.getHeadDegrees();
        Assert.assertEquals(0.0, xPos,.01);
        Assert.assertEquals(0.0, yPos,.01);
        Assert.assertEquals(270, hDegrees, 1);
    }
}
