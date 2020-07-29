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
                    System.out.println("Draw the square");
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:

                    System.out.println("The width: ");
                    int widthTrianger = sc.nextInt();
                    System.out.println("The height: ");
                    int heightTrianger = sc.nextInt();
                    System.out.println("1. Right triangle botton-left");
                    System.out.println("2. Right triangle top-left");
                    int selection = sc.nextInt();
                    switch (selection){
                        case 1:
                            System.out.println("Draw the trianger botton-left!");
                            for (int i = 0; i < heightTrianger; i++) {
                                System.out.println();
                                for (int j = 0; j < widthTrianger; j++) {
                                    if (j<=i){
                                        System.out.print("*");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Draw the trianger top-left!");
                            for (int i = 0; i < heightTrianger; i++) {
                                System.out.println();
                                for (int j = widthTrianger; j > 0; j--) {
                                    if (j > i) {
                                        System.out.print("*");
                                    }
                                }
                            }
                    }
                    break;
                case 3:
                    System.out.println("The height : ");
                    int heightRightTrianger = sc.nextInt();
                    System.out.println("The width: ");
                    int widthRightTrianger = sc.nextInt();
                    for (int i = 1; i <= widthRightTrianger; i++) {
                        System.out.println();
                        for (int j = 1; j <= heightRightTrianger; j++) {
                            if (j <= heightRightTrianger/2 - i || j >= heightRightTrianger/2 +i){
                                System.out.print(" ");
                            }else{
                                System.out.print("*");
                            }
                        }
                    }
                    break;
                case 0 :
                System.exit(0);

            }
        }
    }
}
