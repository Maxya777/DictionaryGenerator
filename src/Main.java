import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("giбрый|gyнь|" +
                "мы|hбiригyны|рhgы|приuyтстuiuhть|uhс|у|нhс|u|hбiригyнии|" +
                "желhyм|uhм|приятнi|прiuyсти|uрyмя|u|кiтлy|и|iтличнi|прiuhриться");
        list.stream()
                .map(s -> s.replaceAll("i", "o"))
                .map(s -> s.replaceAll("y", "e"))
                .map(s -> s.replaceAll("g", "д"))
                .map(s -> s.replaceAll("h", "a"))
                .map(s -> s.replaceAll("u", "в"))
                .map(s -> s.replaceAll("\\|", " "))
                .forEach(System.out::println);
    }
}
