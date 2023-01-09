package stream;

import java.util.List;

public class DeclarativePrograming {
    public static void main(String[] args) {
        List<Integer> numburs1 = List.of(1, 3, 6, 7, 8, 11);

        int sum =
                numburs1.stream()
                        .filter(numbur -> numbur > 4 && (numbur % 2 == 0))
                        .mapToInt(numbur -> numbur)
                        .sum();
        System.out.println("선언형 프로그래밍을 사용한 합계 : " + sum);

    }
}
