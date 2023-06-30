package Aula06;

public class LoopShape {

    public static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Dimensões inválidas.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int size) {
        if (size < 1) {
            System.out.println("Dimensão inválida.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rectangleWidth = 5;
        int rectangleHeight = 4;
        createRectangle(rectangleWidth, rectangleHeight);

        int triangleSize = 5;
        createTriangle(triangleSize);
    }
}
