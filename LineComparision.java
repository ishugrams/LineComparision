import java.util.Scanner;

class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to LineComparision");

        // Create two Line objects
        Line line1 = new Line();
        Line line2 = new Line();

        // Input points for both lines
        System.out.println("Enter coordinates for the first line:");
        line1.inputPoints();
        System.out.println("Enter coordinates for the second line:");
        line2.inputPoints();

        // Checking equality of two lines
        if (line1.isEqualTo(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }
    }
}

class Line {
    private int x1, y1, x2, y2;

    // Method to input the coordinates of the line
    public void inputPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        y2 = sc.nextInt();
    }

    // Method to calculate the squared length of the line
    public int getSquaredLength() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return dx * dx + dy * dy;
    }

    // Method to check if this line is equal to another line
    public boolean isEqualTo(Line other) {
        int thisLengthSquared = getSquaredLength();
        int otherLengthSquared = other.getSquaredLength();
        return thisLengthSquared == otherLengthSquared;
    }
}
