public class VectorMultiplication {

    public static void main(String[] args) {
        // Sample vectors (modify these as needed)
        double[] vector1 = {1, 2, 3};
        double[] vector2 = {4, 5, 6};

        // Calculate dot product
        double dotProduct = calculateDotProduct(vector1, vector2);

        System.out.println("Dot product of vectors: " + dotProduct);
    }

    public static double calculateDotProduct(double[] vector1, double[] vector2) {
        // Ensure vectors have the same dimension
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vectors must have the same dimension");
        }

        double product = 0;
        for (int i = 0; i < vector1.length; i++) {
            product += vector1[i] * vector2[i];
        }

        return product;
    }
}