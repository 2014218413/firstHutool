package My.j8;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8 {
    public static void main(String[] args) {
        Stream.of("1","222","3333","ds").collect(Collectors.toCollection(LinkedList::new));
    }
}
