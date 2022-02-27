package classtypes;

public class RobotClassP {
    private int maxSpeed;

    public RobotClassP(){
        this.maxSpeed = 1;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0)
            this.maxSpeed = maxSpeed;
        else
            this.maxSpeed = 0;
    }
    public void travel(){
        System.out.println("The robot moves a distance of " + maxSpeed + " units" );
    }
}
