import java.util.*;
class Prime{
    public static void main(String args[]){
        int number, m, i,flag=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        number= in.nextInt();

        m =number/2;
        for(i =2;i<m;i++){
            if(number%i==0){
                System.out.println("Not a Prime");
                flag =0;
                break;
            }
            else if (number<=0){
                System.out.println("Not a Prime");
                flag =0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Prime");
        }

    }
}