import java.util.*;
class fib{
    public static void main(String[] args){
        int number, i=2, n1=0,n2=1, n3=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Number");
        number = in.nextInt();
        for(i=2;i<number;++i){
            while(n3<number){
                n3=n1+n2;
                System.out.println(" "+n3);
                n1 = n2;
                n2 = n3;
                
            }
        }
    }
}