import java.io.*;
import java.util.*;
public class ConvertInt {
    public static void main(String[] args) {
        String s="1A";
        int i= Integer.parseInt(s,16);
        System.out.printf("Hex Value of "+s+" ="+i);
    }
}
