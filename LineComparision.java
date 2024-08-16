import java.util.Scanner;

class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to LineComparision");

        DisplayDemo dobj = new DisplayDemo();
        dobj.Display();
    }
}

class DisplayDemo {
    public void Display() {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first point (x1, y1)
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        // Taking input for the second point (x2, y2)
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        // Calculating the difference
        int dx = x2 - x1;
        int dy = y2 - y1;

        // Manually calculating (x2 - x1)^2 and (y2 - y1)^2
        int dxSquared = dx * dx;
        int dySquared = dy * dy;

        // Adding the squares
        int sumOfSquares = dxSquared + dySquared;

        // Simple iterative approach to find the square root
        double length = 0;
        for (int i = 0; i * i <= sumOfSquares; i++) {
            length = i;
        }

        // Fine-tuning the square root value using a basic increment approach
        for (double j = length; j * j <= sumOfSquares; j += 0.01) {
            length = j;
        }

        // Displaying the length of the line
        System.out.println("Length of the line between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is approximately: " + length);
    }
}
