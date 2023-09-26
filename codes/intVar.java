public class intVar {
    int a=10;
    public static void main(String[] args){
        intVar myObj = new intVar();
        int m= myObj.a/0;
        System.out.println(m);
    }
}
