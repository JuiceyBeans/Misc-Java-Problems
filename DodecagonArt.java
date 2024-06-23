import java.util.Scanner;

public class DodecagonArt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size (number of rows): ");
        int size = scanner.nextInt();

        // Calculate angle between consecutive lines
        double angle = 360.0 / 12; // 12 sides in a dodecagon

        // Starting and ending points for each line
        double startX, startY, endX, endY;

        // Loop to generate each line
        for (int i = 0; i < 12; i++) {
            // Calculate starting coordinates for the current line
            startX = size * Math.cos(Math.toRadians(angle * i));
            startY = size * Math.sin(Math.toRadians(angle * i));

            // Calculate ending coordinates for the current line (shifted by 120 degrees for next side)
            endX = size * Math.cos(Math.toRadians(angle * (i + 1) % 12));
            endY = size * Math.sin(Math.toRadians(angle * (i + 1) % 12));

            // Print the line using asterisks (*)
            drawLine(startX, startY, endX, endY, size);
        }

        scanner.close();
    }

    public static void drawLine(double startX, double startY, double endX, double endY, int size) {
        int xStart = Math.round((float) startX) + size;
        int yStart = Math.round((float) startY) + size;
        int xEnd = Math.round((float) endX) + size;
        int yEnd = Math.round((float) endY) + size;

        // Bresenham's line algorithm to handle slopes
        int dx = xEnd - xStart;
        int dy = yEnd - yStart;
        int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
        double xIncrement = dx / (double) steps;
        double yIncrement = dy / (double) steps;
        double x = xStart, y = yStart;

        for (int i = 0; i <= steps; i++) {
            System.out.println((int) Math.round(y) + " " + (int) Math.round(x));
            x += xIncrement;
            y += yIncrement;
        }
    }
}