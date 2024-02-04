public class Palindrome {
    public static void main(String[] args) {
        String Palindrome= new String("Rod saw I was Dor");
        int len= Palindrome.length();
        StringBuilder dest=new StringBuilder();
        for(int i=(len-1);i>=0;i--){
            dest.append(Palindrome.charAt(i));
        }
        System.out.printf("%s %n",dest.toString());
    }
}
