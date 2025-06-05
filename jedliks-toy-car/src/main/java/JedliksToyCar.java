public class JedliksToyCar {
    private int stepInMeters = 20;
    private int batteryLevel = 100;
    private int distanceDriven = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }
    
    public String batteryDisplay() {
        return (this.batteryLevel == 0) ? "Battery empty" : "Battery at " + this.batteryLevel + '%';
    }

    public void drive() {
        if(this.batteryLevel != 0) {
            this.distanceDriven += stepInMeters;
            this.batteryLevel -= 1;
        }
    }

    // public static void main(String[] args) {
    //     JedliksToyCar car = JedliksToyCar.buy();
    //     car.drive();
    //     System.out.println(car.distanceDisplay());
    // }
}
