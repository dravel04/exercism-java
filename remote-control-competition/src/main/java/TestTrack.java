import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        // Collections.sort(cars); -> de menor a mayor
        // Collections.sort(cars, Collections.reverseOrder()); -> de mayor a menor
        Collections.sort(cars, Collections.reverseOrder());
        return cars;
    }

}
