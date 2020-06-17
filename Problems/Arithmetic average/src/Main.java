import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();

        double numberOfDivisibleItemsByThree = 0;
        double sumOfDivisibleItemsByThree = 0;
        for (int i = startNum; i <= endNum; i++) {
            if (i % 3 == 0) {
                sumOfDivisibleItemsByThree += i;
                numberOfDivisibleItemsByThree++;
            }
        }

        System.out.println(sumOfDivisibleItemsByThree / numberOfDivisibleItemsByThree);
    }
}