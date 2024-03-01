import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UppercaseFormatter uppercaseFormatter = new UppercaseFormatter();
        System.out.println("Write word");
        uppercaseFormatter.messageFormate(scanner.nextLine());
        LowercaseFormetter lowercaseFormetter = new LowercaseFormetter();
        System.out.println("Write word");
        lowercaseFormetter.messageFormate(scanner.nextLine());
    }
}