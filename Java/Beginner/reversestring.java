public class reversestring
{
    
    

    public static void main(String[] args)
    {
        String input="Demostring and Demo";
        String output="";
        int length=input.length();
        //System.out.print(length);
        for(int i=length-1;i>=0;--i){
            output=output+input.charAt(i);
            System.out.print(input.charAt(i));

        }

        System.out.println(output);
    }
}
