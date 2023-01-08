package cafeInterface;
interface Customar{
   String getOrder();
}

class CafeCustomarA implements Customar{
    public String getOrder(){
        return "a glass of iced amerricano";
    }
}
class CafeCustomarB implements Customar{
    public String getOrder(){
        return "a glass of strawbarry latee";
    }

}
class CafeOwner {
    public void giveItem(Customar customar){
        System.out.println("Item : " + customar.getOrder());
    }
}
public class OrderExample {
    public static void main(String[] args) throws Exception{
        CafeOwner cafeOwner = new CafeOwner();
        Customar cafeCustomerA = new CafeCustomarA();
        Customar cafeCustomerB = new CafeCustomarB();

        cafeOwner.giveItem(cafeCustomerA);
        cafeOwner.giveItem(cafeCustomerB);
    }

}
