package framework.domain;

public class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public void changeSpeedBy(int speed){
        if(this.speed == 0 && speed<0) return;
        this.speed += speed;
        System.out.println("Inside change car speed: "  + this.speed );
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
