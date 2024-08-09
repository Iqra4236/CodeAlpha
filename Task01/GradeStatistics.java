// Class to store and provide access to grade statistics
class GradeStatistics {
    private final double average;
    private final double highest;
    private final double lowest;

    // Constructor to initialize statistics
    public GradeStatistics(double average, double highest, double lowest) {
        this.average = average;
        this.highest = highest;
        this.lowest = lowest;
    }

    // Getter for average grade
    public double getAverage() {
        return average;
    }

    // Getter for highest grade
    public double getHighest() {
        return highest;
    }

    // Getter for lowest grade
    public double getLowest() {
        return lowest;
    }
}