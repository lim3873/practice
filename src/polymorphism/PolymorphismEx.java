package polymorphism;

//다형성 적용
public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");


    }
}


class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano(){
        super(4000);
    }

    public String toString(){return "아메리카노";};
}

class CaffeLatte extends Coffee {
    public CaffeLatte(){
        super(5000);
    }

    public String toString(){return "카페라떼";};
}

class Customer {
    int money = 50_000;

    void buyCoffee(Coffee coffee) {
        //예외처리는 항상 최 상단에서 해줘야한다
        if(money < coffee.price) { // 물건 가격보다 돈이 없는 경우
            System.out.println("잔액이 부족합니다.");
        }
        money = money - coffee.price; // 가진 돈 출력
        System.out.println(coffee + "를 구입하였습니다.");
    }

// 커피의 종류가 많이질수록 일일히 커피의 정보를 매개변수로 호출하는 방법이 불편해진다
//    void boyCoffee(polymorphism.CaffeLatte caffeLatte){ // 카페라테 구입
//        money = money - americano.price;
//    }
//    void buyCoffee(polymorphism.Americano americano){ // 아메리카노 구입
//        money = money - caffeLatte.price;
//    }
//   매개변수의 다형성을 이용해 이용해서 coffe 상위 클래스에서 해결을 할수도 있음
//
//    void buyCoffe(polymorphism.Coffee coffee){
//        money = money - coffee.price;
//    }
}




