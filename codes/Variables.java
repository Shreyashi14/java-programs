class Variables{
        int i;//instance variable
        public int j ;//instance variable
        static long l=10;//class variable
        public static float f;//class variable
        char c;//instance variable
        boolean b;//instance variable
        void display(int a){
            i=a;
            System.out.println("i value in display: "+i);
        }
        public static void main(String args[]){
            double d=0.0;//local varible
//public double d=0.0; invalid
            Variables v1=new Variables();
            Variables v2=new Variables();
            Variables v3=new Variables();
            v1.display(100);
            v1.i=2;
            v2.i=3;
            v3.i=4;
            System.out.println("i value is: "+v1.i);
            System.out.println("i value is: "+v2.i);
            System.out.println("i value is: "+v3.i);
            System.out.println("i value is: "+v1.j);
            v1.l=20;
            v2.l=30;
            v3.l=40;
            System.out.println("l value is: "+v1.l);
            System.out.println("l value is: "+v2.l);
            System.out.println("l value is: "+v3.l);
            System.out.println("f value is: "+f);
            System.out.println("c value is: "+v1.c);
            System.out.println("b value is: "+v1.b);
            System.out.println("d value is: "+d);
        }
}