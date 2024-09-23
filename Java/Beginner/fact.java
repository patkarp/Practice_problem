import java.util.*;
class fact
{
    public static void main(String[] args){
        int number, fact=1, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        number = in.nextInt();
        if(number<=0){
            System.out.println("Number is Negative");
        }
        else if(number == 0)
        {
            System.err.println("Factorial of 0 is 0");
            
        }
        else{
            for(i=1;i<=number;i++){
                fact= fact*i;

            }
        }
        System.err.println("Factorial of "+number+" is " + fact);
    }

}