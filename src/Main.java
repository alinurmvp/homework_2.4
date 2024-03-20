import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Список А " + (i + 1) + ": ");
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("------------");
        System.out.println("Список В:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            listB.add(input);
        }

        List<String> listC = new ArrayList<>();
        int size = Math.min(listA.size(), listB.size());

        for (int i = 0; i < size; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(size - i - 1));
        }
        System.out.println("------------");
        System.out.println("Список C:");
        for (String str : listC) {
            System.out.println(str);
        }
        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("------------");
        System.out.println("Список по длине слова : ");
        for (String str : listC) {
            System.out.println(str);
        }
    }
}