import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (random.nextInt(9000) + 1000);
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble() * 1000.0;
    }

    // public static void main(String[] args) {
    //     Random random = new Random(47);
    //     CaptainsLog captainsLog = new CaptainsLog(random);
    //     System.out.println(captainsLog.randomStardate());
    // }
}
