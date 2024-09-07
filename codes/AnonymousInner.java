abstract class Person{
    abstract void eat();
}
class AnonymousInner{
    public static void main(String args[]){
//Anonymous Inner Class
        Person p=new Person(){
            void eat(){System.out.println("nice fruits");}
        };
        p.eat();
    }
}