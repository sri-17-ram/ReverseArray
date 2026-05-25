interface SmartDevice {
    void turnOn();
    void turnOff();
}
class SmartTV implements SmartDevice {
    public void turnOn() {
        System.out.println("SmartTV is ON");
    }
    public void turnOff() {
        System.out.println("SmartTV is OFF");
    }
}
class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("SmartFan is ON");
    }
    public void turnOff() {
        System.out.println("SmartFan is OFF");
    }
}
public class SmartHome{
    public static void main(String[] args) {
        SmartDevice tv = new SmartTV();   
        SmartDevice fan = new SmartFan();
        tv.turnOn();
        tv.turnOff();
        fan.turnOn();
        fan.turnOff();
    }
}
