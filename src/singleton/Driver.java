package singleton;

public class Driver {
    // The static instance of the Driver
    private static Driver driver;

    // Private constructor to prevent external instantiation
    private Driver() {}

    // Static method to return the instance of the Driver
    public static Driver getDriver() {
        if (driver == null) {
            driver = new Driver();
        }
        return driver;
    }
}
