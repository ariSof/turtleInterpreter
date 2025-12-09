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

/* attempt to revise and correct my original memento design pattern implementation -JG*/
//     public static class TurtleMemento{
//         private final double distanceX;
//         private final double distanceY;
//         private final double headDegrees;
//         private final boolean penUp;

//         public TurtleMemento(double distanceX, double distanceY, double headDegrees, boolean penUp) {
//             this.distanceX = distanceX;
//             this.distanceY = distanceY;
//             this.headDegrees = headDegrees;
//             this.penUp = penUp;
//         }
//     }
//     public TurtleMemento save() {
//         return new TurtleMemento(distanceX, distanceY, headDegrees, penUp);
//     }
//     public void restore(TurtleMemento memento) {
//         this.distanceX = memento.distanceX;
//         this.distanceY = memento.distanceY;
//         this.headDegrees = memento.headDegrees;
//         this.penUp = memento.penUp;
//     }
//     @Override
//     public String toString() {
//         System.out.printf("Turtle: location (%.2f, %.2f)", distanceX, distanceY);
//         return " Orientation= " + headDegrees + " degrees, is pen up? " + penUp;
//     }
    
    

// }

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
        System.out.printf("Turtle: location (%.2f, %.2f)", distanceX, distanceY);
        return " Orientation= " + headDegrees + " degrees, is pen up? " + penUp;
    }
}
