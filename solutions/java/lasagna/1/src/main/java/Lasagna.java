public class Lasagna {
    //int fullTimeInTheOven;
    //int preparingTime;
    //int actualMinutesInTheOven;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven (int actualMinutesInTheOven) {
        int remining = expectedMinutesInOven() - actualMinutesInTheOven;
        return remining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int numberOfLayers ) {
        int preparingTime = numberOfLayers * 2;
        return preparingTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers , int  actualMinutesInTheOven ) {
        int total = preparationTimeInMinutes(numberOfLayers) +  actualMinutesInTheOven;
        return total;
    }
}
