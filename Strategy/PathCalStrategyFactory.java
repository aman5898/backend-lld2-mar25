package Strategy;

public class PathCalStrategyFactory {
    public static PathCalcStrategy createPathCalculator(TravelMode travelMode) {
        switch (travelMode) {
            case CAR:
                return new CarPathCalcStrategy();
            case BIKE:
                return new BikePathCalcStrategy();
            case WALK:
                return new WalkPathCalcStrategy();
            default:
                return new CarPathCalcStrategy();
        }
    }
}
