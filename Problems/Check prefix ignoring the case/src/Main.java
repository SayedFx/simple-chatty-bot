import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        System.out.println(firstChar == "J".charAt(0) || firstChar == "j".charAt(0));
    }
}