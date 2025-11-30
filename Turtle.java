// Turtle class keeps track of its own location, orientation and penUp/down

public class Turtle {
    int location;
    int orientation;
    boolean penUp;

    public Turtle(){
        location = 0;
        orientation = 0;
        penUp = true;
    }

    public void setLocation(int move){
        location = location + move;
    }

    public int getLocation(){
        return location;
    }

    public void setOrientation(int angle){
        orientation = orientation + angle;
    }

    public int getOrientation(){
        return orientation;
    }

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

    @Override
    public String toString() {
         
        return "Turtle: location "+ location + " orientation " + orientation + ", is pen up? " + penUp;
    }
}
