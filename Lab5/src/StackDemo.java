import java.util.Scanner;

// New class name: StackDemo
public class StackDemo {
    public static void main(String[] args) {
        StackContainer stack = new StackContainer();

        Scanner scanner = new Scanner("6 "+"+ 1\n"+"+ 10\n"+"-\n"+"+ 2\n"+"+ 1234\n"+"-\n");

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            switch (commands[0]) {
                case "+" -> stack.push(Integer.parseInt(commands[1]));
                case "-" -> System.out.println(stack.pop());
            }
        }
    }
}
