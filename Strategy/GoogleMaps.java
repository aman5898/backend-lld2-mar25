package Strategy;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode) {
        PathCalcStrategy p = PathCalStrategyFactory.createPathCalculator(travelMode);
        p.findPath();
    }


    void findPathByMode2(PathCalcStrategy p) {
        p.findPath();
    }

}