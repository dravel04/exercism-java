public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentTimeInOven) {
        return this.expectedMinutesInOven() - currentTimeInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerNumber) {
        int layerPreparationTime = 2;
        return layerPreparationTime * layerNumber;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerNumber, int timeInOven) {
        return this.preparationTimeInMinutes(layerNumber) + timeInOven;
    }


    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes in oven: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation minutes in oven: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Total minutes in oven: " + lasagna.totalTimeInMinutes(3, 20));
    }
}

