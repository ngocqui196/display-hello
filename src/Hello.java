import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Your name:");
        name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
