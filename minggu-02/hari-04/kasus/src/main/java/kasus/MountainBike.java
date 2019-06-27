package kasus;
public class MountainBike extends Bicycle {

    // new fields and methods defining 
    // a mountain bike would go here
    int maxspeed;
    public void maxspeed(int speed){
        maxspeed = speed;
    }
    public void printStatesM(){
        System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear + 
             " maxspeed: "+ maxspeed);
    }
}