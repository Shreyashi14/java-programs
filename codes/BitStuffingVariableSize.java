public class BitStuffingVariableSize {

    public static void bitStuffing(int[] data, int[] stuffedData, int[] stuffedSize) {
        int count = 0;
        int j = 0;

        for (int i = 0; i < data.length; i++) {
            stuffedData[j++] = data[i];

            if (data[i] == 1) {
                count++;
            } else {
                count = 0;
            }


            if (count == 5) {
                stuffedData[j++] = 0;
                count = 0;
            }
        }

        stuffedSize[0] = j;
    }

    public static void main(String[] args) {
        int[] data = {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int[] stuffedData = new int[20];
        int[] stuffedSize = new int[1];

        bitStuffing(data, stuffedData, stuffedSize);

        int totalSize = stuffedSize[0];
        int frameSize = 8;
        int numberOfFrames = (int) Math.ceil((double) totalSize / frameSize);

        int currentPosition = 0;
        System.out.print("Stuffed Data: ");
        for (int i = 0; i < totalSize; i++) {
            System.out.print(stuffedData[i] + " ");
        }
        System.out.println();

        System.out.println("Number of frames required: " + numberOfFrames);

        System.out.println("Frame sizes:");
        for (int frame = 0; frame < numberOfFrames; frame++) {
            int start = frame * frameSize;
            int end = Math.min(start + frameSize, totalSize);
            int size = end - start;
            System.out.println("Frame " + (frame + 1) + " size: " + size);
        }
    }
}
