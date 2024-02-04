public class ForEach {
    public static void main(String[] arg) {
        int[] marks = { 125, 172, 95, 116, 110 };
        int highest_marks = marks[0];
        for (int num : marks)
        {
            if (num > highest_marks)
            {
                highest_marks = num;
            }
        }
        System.out.println("The highest score is " + highest_marks);
    }
}
