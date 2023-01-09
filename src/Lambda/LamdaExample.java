package Lambda;

public class LamdaExample {
    public static void main(String[] args) {
        /*
        Object object = new Object() {
            int sum(int num1, int num2) {
                return num1 + num2;
            }
        };
             */
        ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10, 15));

    }
}

@FunctionalInterface
interface ExampleFunction {
    int sum(int num1, int num2);
}