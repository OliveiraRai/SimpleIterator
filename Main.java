import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter start: ");
            String fakeStart = input.nextLine().trim();

            System.out.print("Enter end: ");
            String fakeEnd = input.nextLine().trim();

            System.out.print("Enter increment: ");
            String fakeIncrement = input.nextLine().trim();

            if (fakeStart.isEmpty() || fakeEnd.isEmpty() || fakeIncrement.isEmpty()) {
                System.out.print("Please, make sure to fill all fields.");
                System.exit(0);;
            }
            
            int start = Integer.parseInt(fakeStart);
            int end = Integer.parseInt(fakeEnd);
            int increment = Integer.parseInt(fakeIncrement);

            if (increment <= 0) {
                while (true) {
                    System.out.println();
                    System.out.println("Only enter numbers greater than 0, please.");
                    System.out.print("Enter increment: ");
                    increment = input.nextInt();

                    if (increment > 0) {
                        break;
                    }
                }
            }


            System.out.println();

            if (end > start) {
                for (int i = start; i <= end; i += increment) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = start; i >= end; i -= increment) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
            System.out.print("Counting finished!");
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.print("Ops! Only numbers are allowed here.");
            System.exit(0);
        }

        input.close();
    }
}