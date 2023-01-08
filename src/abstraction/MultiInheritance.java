/*


Interface로 전체 적용. abstract 미적용


 */

//
//package abstraction;
//
//interface Animal{
//    public abstract void cry();
//}
//
//interface Pet{
//    void play();
//}
//
//class Dog implements Animal, Pet{ // Animal과 Pet 인터페이스 다중상속
//    public void cry(){ // 메서드 오버라이딩
//        System.out.println("멍멍");
//    }
//    public void play(){ // 메서드 오버라이딩
//        System.out.println("원반 던지기");
//    }
//}
//class Cat implements Animal, Pet{ // Animal과 Pet 인터페이스 다중상속
//    public void cry(){ // 메서드 오버라이딩
//        System.out.println("야옹~!");
//    }
//    public  void play(){ // 메서드 오버라이딩
//        System.out.println("쥐 잡기!");
//    }
//}
//
//public interface MultiInheritance {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        dog.cry();
//        dog.play();
//        cat.cry();
//        cat.play();
//    }
//}
