import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. print the rectanger");
        System.out.println("2. Print the square trianger");
        System.out.println("2. Print isoccoles trianger");
        System.out.println("0. Exit");
        while (true){
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("The width: ");
                    int width = sc.nextInt();
                    System.out.println("The height: ");
                    int height = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        System.out.println("\n");
                        for (int j = 0; j < height; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:

            }
        }
    }
}
