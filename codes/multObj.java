public class multObj {
    int x=20;
    public static void main(String[] args){
        multObj myObj1 = new multObj();
        multObj myObj2 = new multObj();
        myObj2.x=5;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
