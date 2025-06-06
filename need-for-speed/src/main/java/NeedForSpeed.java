class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int batteryLevel = 100;
    private int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (batteryDrain == 0 || batteryLevel - batteryDrain < 0);
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if( !batteryDrained() ) {
            this.distance += speed;
            this.batteryLevel -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    // public static void main(String[] args) {
    //     int speed = 2;
    //     int batteryDrain = 1;
    //     var car = new NeedForSpeed(speed, batteryDrain);

    //     // Almost drain the battery
    //     for (var i = 0; i < 99; i++) {
    //         car.drive();
    //     }

    //     System.out.println(car.batteryDrained());
    // }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (this.distance <= (100 / car.batteryDrain) * car.speed);
    }
}
