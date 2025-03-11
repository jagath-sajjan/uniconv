import java.util.Scanner;

public class AreaTool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        funb f = new funb();
        int inp;
        do {
            System.out.println(" ");
            System.out.println("THE AREA TOOL :)");
            System.out.println(" ");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Rectangle");
            System.out.println("5. Exit");
            System.out.println(" ");
            System.out.print("Enter A Option [1,2,3,4,5]: ");
            inp = in.nextInt();
            System.out.println(" ");
            switch (inp) {
                case 1:
                    System.out.print("Enter Radius Of The Circle: ");
                    double r = in.nextDouble();
                    f.CirA(r);
                    break;
                case 2:
                    System.out.print("Enter Height Of The Triangle: ");
                    double h = in.nextDouble();
                    System.out.print("Enter Base Of The Triangle: ");
                    double b = in.nextDouble();
                    f.TriA(h, b);
                    break;
                case 3:
                    System.out.print("Enter The Side Of The Square: ");
                    double side = in.nextDouble();
                    f.SqA(side);
                    break;
                case 4:
                    System.out.print("Enter The Length Of Rectangle: ");
                    double l = in.nextDouble();
                    System.out.print("Enter The Width Of Rectangle: ");
                    double w = in.nextDouble();
                    f.ReA(l, w);
                    break;
                case 5:
                    System.out.println("Byeee Have A Great Time :)");
                    break;
                default:
                    System.out.println("Enter A Valid Option :(");
                    break;
            }
        }while (inp != 5);
        in.close();
    }
}

class funb {
    void CirA (double r) {
        System.out.println("The Area Of Circle: " + 3.14 * r * r);
    }
    void TriA (double h, double b) {
        System.out.println("The Area Of Triangle: " + 0.5 * h * b);
    }
    void SqA (double side){
        System.out.println("The Area Of Square: " + side * side);
    }
    void ReA (double l, double w) {
        System.out.println("The Area Of Rectangle: " + l * w);
    }
}