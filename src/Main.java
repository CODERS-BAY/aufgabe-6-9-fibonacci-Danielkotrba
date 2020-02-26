import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        System.out.println(getFibonacci(n));
    }

    public static Integer getFibonacci(Integer n) {
        if (n == 0 || n == 1){
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);

    }
}