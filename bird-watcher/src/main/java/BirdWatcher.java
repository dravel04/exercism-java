import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for( int count : this.birdsPerDay ) {
            if( count == 0 ) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalDays = 0;
        int arrayLength = (numberOfDays > this.birdsPerDay.length) ? this.birdsPerDay.length : numberOfDays;

        for( int i = 0; i < arrayLength; i++) {
            totalDays += this.birdsPerDay[i];
        }
        
        return totalDays;
    }
    
    public int getBusyDays() {
        int totalBusyDays = 0;
        for( int i = 0; i < this.birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] >= 5) totalBusyDays++;
        }
    
        return totalBusyDays;
    }

    // public static void main(String[] args) {
    //     int DAY1 = 0;
    //     int DAY2 = 2;
    //     int DAY3 = 5;
    //     int DAY4 = 3;
    //     int DAY5 = 7;
    //     int DAY6 = 8;
    //     int TODAY = 4;

    //     int lastWeek[] = {DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY};
    //     BirdWatcher birdWatcher = new BirdWatcher(lastWeek);

    //     System.out.println(birdWatcher.getBusyDays());
    // }
}
