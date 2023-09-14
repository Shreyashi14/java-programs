public class prime {
    public static void main(String[] args)
    {
        int num=20,c=0;
        for(int i=2;i<=num;++i){
            //condition
            if(num%i==0){
                c++;
            }
        }
        if(c==1){
            System.out.println(num +" is a prime number.");
        }
        else{
            System.out.println(num +" is not a  prime number.");
        }
    }
}

