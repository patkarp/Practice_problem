import java.io.*;
import java.util.*;
class Chaitali
{
    void print(String s1){
        for(int i=0; i<=9; i++){
            System.out.println(s1); 
        }
    }
    public static void main (String[] args){
        Chaitali s= new Chaitali();
        String S1="Prathamesh";
        String S2="Chaitali";

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");
        String ip=in.next();

        if(S1.equals (ip)){
            s.print(S1); 

        }else if(S2.equals (ip)) {
            s.print(S1); 
        }
        else{
            System.out.println("String not found");
        }        
    }
}