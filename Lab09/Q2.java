import java.util.Scanner;

public class PlayerController {
    public static void moveUp() {
        System.out.println("Moving Up");
    }

    public static void moveDown() {
        System.out.println("Moving Down");
    }

    public static void moveLeft() {
        System.out.println("Moving Left");
    }

    public static void moveRight() {
        System.out.println("Moving Right");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press 'W' to move Up");
            System.out.println("Press 'S' to move Down");
            System.out.println("Press 'A' to move Left");
            System.out.println("Press 'D' to move Right");
            System.out.println("Press 'Q' to Quit");

            char userInput = scanner.next().toUpperCase().charAt(0);

            switch (userInput) {
                case 'W':
                    moveUp();
                    break;
                case 'S':
                    moveDown();
                    break;
                case 'A':
                    moveLeft();
                    break;
                case 'D':
                    moveRight();
                    break;
                case 'Q':
                    System.out.println("Quitting the game.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
