/* This is a simple Java program
  named as example.java*/
public class example {
    public static void main(String[] args){
        /* public-> access specifier which allows the programmer to
                    access the method outside the main class.
                    By default it is public, basically scope of program
           static-> it is access modifier that means when the java program is
                    loaded then it will create the space in memory automatically
                    It doesn't have any object state, so you can call
                    it without instantiating an object.
           void->  it is a return type that is it does not return any value
           main()-> it is a method or a function name
           String args-> It is an array of strings of
                         Java string class,"S" always capital
           args-> array of the arguments which we pass through the command line
                  It is a variable name, can be changed */
        System.out.println(args[0]);
        System.out.print("This is a simple");
        System.out.println(" Java program");
         /* here System-> It is a final class defined in the java.lang package
         out.println-> It is a method in Java that prints a message to the
         standard output (typically the console) and appends a newline character.
        "." is a kind of traversing method in java.Using it we tell the compiler
        to access the println() function, which is inside the out object,
        which is inside the System class.*/
        /*The println("...") method prints the string "..." and moves the
          cursor to a new line. The print("...") method instead prints just
          the string "...", but does not move the cursor to a new line*/
    }
}
/* java c is used for compilation*/
