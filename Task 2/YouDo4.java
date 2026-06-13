class Sensor {
    String name;
    int batteryLevel;

    
    Sensor(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Sensor s = new Sensor("Thermal_01", 45);
        s.charge();
        System.out.println("New battery level: " + s.batteryLevel + "%");
    }
}
