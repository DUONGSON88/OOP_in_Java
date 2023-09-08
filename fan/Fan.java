package fan;

public class Fan {
    private int slow = 1;
    private int medium = 2;
    private int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public String toString() {
        String stage = "";
        if (this.isOn()) {
            stage += "speed " + this.speed + " ,radius " + this.radius + " ,color " + this.color;
            stage += " Fan is on";
        } else {
            stage += "speed " + this.speed + " ,radius " + this.radius + " ,color " + this.color;
            stage += " Fan is off";
        }
        return stage;
    }
}
