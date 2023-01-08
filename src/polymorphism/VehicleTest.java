package polymorphism;

public class VehicleTest {
    Car car = new Car();
    Veichle veichle = (Veichle) car;
    Car car2 = (Car) veichle;
//    polymorphism.MotorBike motorBike = (polymorphism.MotorBike) car;

}

class Veichle {
    String medel;
    String color;
    int wheels;

    void startEngine() {
        System.out.println("시동 걸기");
    }

    void accelerate() {
        System.out.println("속도 올리기");
    }

    void brake() {
        System.out.println("브레이크!");
    }
}

class Car extends Veichle{
    void giveRide(){
        System.out.println("다른사람 태우기");
    }
}

class MotorBike extends Veichle{
    void performance(){
        System.out.println("묘기 부리기");
    }
}