package abstraction;

abstract class Animal1 { //    공통적인 특성을 모아 먼저 추상 클래스로 선언
    public String kind;

    public abstract void sound1();

}

//    이를 기반으로 각각의 상속된 하위 클래스에서 오버라이딩을 통해 클래스의 구체적인 내용을 결정
class Dog1 extends Animal1 {
    public Dog1() {
        this.kind = "포유류";
    }

    public void sound1() { // 메서드 오버라이딩 -> 구현부 완성
        System.out.println("멍멍");
    }
}

class Cat1 extends Animal1 {
    public Cat1() {
        this.kind = "포유류";
    }

    public void sound1() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args) throws Exception {
        Animal1 dog1 = new Dog1();
        dog1.sound1();

        Cat1 cat1 = new Cat1();
        cat1.sound1();
    }
}
