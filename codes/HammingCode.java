import java.util.Scanner;

public class HammingCode {

    static class Result {
        int[] hammingCode;
        int[] parityBits;

        Result(int[] hammingCode, int[] parityBits) {
            this.hammingCode = hammingCode;
            this.parityBits = parityBits;
        }
    }

    static Result calculateParityBits(int[] data, int m, int r) {
        int[] hammingCode = new int[m + r];
        int[] parityBits = new int[r];

        int j = 0, k = 0;
        for (int i = 1; i <= m + r; i++) {
            if (Math.pow(2, j) == i) {
                hammingCode[i - 1] = 0;
                j++;
            } else {
                hammingCode[i - 1] = data[k++];
            }
        }

        for (int i = 0; i < r; i++) {
            int position = (int) Math.pow(2, i);
            int parity = 0;
            for (int j1 = position - 1; j1 < hammingCode.length; j1 += 2 * position) {
                for (int k1 = j1; k1 < j1 + position && k1 < hammingCode.length; k1++) {
                    parity ^= hammingCode[k1];
                }
            }
            hammingCode[position - 1] = parity;
            parityBits[i] = parity;
        }
        return new Result(hammingCode, parityBits);
    }

    static int findRedundantBits(int m) {
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)) {
            r++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of data bits: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the data bits: ");
        String dataInput = scanner.nextLine();

        if (dataInput.length() != m || !dataInput.matches("[01]+")) {
            System.out.println("Invalid input! Please enter a binary string of length " + m);
            return;
        }

        int[] dataBits = new int[m];
        for (int i = 0; i < m; i++) {
            dataBits[i] = dataInput.charAt(i) - '0';
        }

        int r = findRedundantBits(m);
        System.out.println("Number of redundant bits: " + r);

        Result result = calculateParityBits(dataBits, m, r);

        System.out.print("Hamming Code: ");
        for (int bit : result.hammingCode) {
            System.out.print(bit);
        }
        System.out.println();

        System.out.print("Parity Bits: ");
        for (int parity : result.parityBits) {
            System.out.print(parity + " ");
        }
        System.out.println();

        // Debugging output
        System.out.println("Data Bits: ");
        for (int bit : dataBits) {
            System.out.print(bit);
        }
        System.out.println();

        System.out.println("Hamming Code Length: " + result.hammingCode.length);
        System.out.println("Parity Bits Length: " + result.parityBits.length);

        scanner.close();
    }
}
