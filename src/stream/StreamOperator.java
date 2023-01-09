package stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamOperator {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("바나나 ");
        fruitList.add("사과 ");
        fruitList.add("오렌지 ");

        String[] fruitArray = {"바나나 ", "사과 ", "오렌지 "};

        Stream<String> ListStream = fruitList.stream();
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        ListStream.forEach(System.out::print);
        ArrayStream.forEach(System.out::print);


    }
}
