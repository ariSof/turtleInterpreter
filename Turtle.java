// Turtle class keeps track of its own location, orientation and penUp/down

public class Turtle {
    //int location;
    //int orientation;
    private double distanceX;
    private double distanceY;

    boolean penUp;
    private double headDegrees; 

    public Turtle(){
        //location = 0;
       // orientation = 0;
       distanceX = 0;
       distanceY = 0;
       headDegrees = 0;

        penUp = true;
    }
    public void move(double distance){
        double radians = Math.toRadians(headDegrees);
        double distanced_X = distance * Math.cos(radians);
        double distanced_Y = distance * Math.sin(radians);
        distanceX += distanced_X;
        distanceY += distanced_Y;

    }
    public void turn(double angle){
        headDegrees = (headDegrees + angle) % 360;
        if(headDegrees < 0){
            headDegrees += 360;
        }

    }
    // public void setLocation(int move){
    //     location = location + move;
    // }

    // public int getLocation(){
    //     return location;
    // }

    // public void setOrientation(int angle){
    //     orientation = orientation + angle;
    // }

    // public int getOrientation(){
    //     return orientation;
    // }

    //Using int for 0-false, 1- true
    public void setPenUp(int isUp){
        if(isUp == 1){
            penUp = true;
        } else{
            penUp = false;
        }
    }

    public boolean getPenUp(){
        return penUp;
    }
public double getDistanceX(){
        return distanceX;
    }
    public double getDistanceY(){
        return distanceY;
    }
    public double getHeadDegrees(){
        return headDegrees;
    }
    @Override
    public String toString() {
         
        return "Turtle: location ("+ distanceX + ", " + distanceY + ") orientation " + headDegrees + ", is pen up? " + penUp;
    }
}
