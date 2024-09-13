import java.util.Scanner;

public class BitStuffingFixedSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of bits: ");
        int numberOfBits = scanner.nextInt();

        System.out.print("Enter the fixed frame size: ");
        int frameSize = scanner.nextInt();

        int totalFrames = (int) Math.ceil((double) numberOfBits / frameSize);

        System.out.println("Number of frames required: " + totalFrames);
    }
}
