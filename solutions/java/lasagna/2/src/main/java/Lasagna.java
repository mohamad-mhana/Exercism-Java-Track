public class Lasagna {
    
    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }
    

    public int remainingMinutesInOven (int actualMinutesInTheOven) {
        int remining = expectedMinutesInOven() - actualMinutesInTheOven;
        return remining;
    }

    public int preparationTimeInMinutes (int numberOfLayers ) {
        int preparingTime = numberOfLayers * 2;
        return preparingTime;
    }
    public int totalTimeInMinutes(int numberOfLayers , int  actualMinutesInTheOven ) {
        int total = preparationTimeInMinutes(numberOfLayers) +  actualMinutesInTheOven;
        return total;
    }
}
