public class methObj {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max Speed is: "+maxSpeed);
    }
    public static void main(String[] args){
        methObj myCar = new methObj();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
