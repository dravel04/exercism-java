public class CarsAssemble {
    private int carsPerHour = 221;

    // 1 to 4: 100% success rate.
    // 5 to 8: 90% success rate.
    // 9: 80% success rate.
    // 10: 77% success rate.
    public double productionRatePerHour(int speed) {
        double production = 0.0;

        if (speed >= 1 && speed <= 4) {
            production = (speed * carsPerHour) * 1;

        } else if (speed >= 5 && speed <= 8) {
            production = (speed * carsPerHour) * 0.9;
            
        } else if (speed == 9) {
            production = (speed * carsPerHour) * 0.8;

        } else if (speed == 10) {
            production = (speed * carsPerHour) * 0.77;
        }
        
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed)/60;
    }

    // public static void main(String[] args) {
    //     CarsAssemble CarsAssemble = new CarsAssemble();
    //     System.out.println(CarsAssemble.productionRatePerHour(6));
    //     System.out.println(CarsAssemble.workingItemsPerMinute(6));
    // }
}

