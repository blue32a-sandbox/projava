package projava;

import java.util.List;

public class InterfaceSample {
    @FunctionalInterface
    interface Named {
        String name();

        default String greeting() {
            return "こんにちは%sさん".formatted(name());
        }
    }

    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    static class Passenger implements Named {
        @Override
        public String name() {
            return "通りすがり";
        }
    }

    public static void main(String[] args) {
        var people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "Math"),
                new Passenger());
        for (Named p : people) {
            System.out.println(p.greeting());
            message(p);
        }
        message(() -> "no name");
    }

    static void message(Named named) {
        System.out.println("Hello " + named.name());
    }
}
