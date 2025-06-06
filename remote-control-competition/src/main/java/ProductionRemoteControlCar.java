class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar car) {
        if( this.numberOfVictories < car.getNumberOfVictories() ) {
            return -1;
            
        } else if ( this.numberOfVictories == car.getNumberOfVictories() ) {
            return 0;
            
        } else {
            return 1;

        }
    }
}
