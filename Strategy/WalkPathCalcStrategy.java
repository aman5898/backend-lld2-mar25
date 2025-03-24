package Strategy;

import java.nio.file.Path;

public class WalkPathCalcStrategy implements PathCalcStrategy {
    @Override
    public void findPath() {
        System.out.println("Walk Path Calc Strategy");
    }
}
