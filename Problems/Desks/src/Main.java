import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDesks = getNumberOfDesks(scanner.nextInt()) + getNumberOfDesks(scanner.nextInt()) + getNumberOfDesks(scanner.nextInt());
        System.out.println(numberOfDesks);
    }

    private static int getNumberOfDesks(int numberOfStudents) {
        return numberOfStudents % 2 == 0 ? numberOfStudents / 2 : (numberOfStudents / 2) + 1;
    }
}