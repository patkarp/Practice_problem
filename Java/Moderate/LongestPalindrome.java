class LongestPalindrome{
    static String islongestPalindrome(String[] isPalindrome){
        //figureout if it is Palindrome
        int maxlength=0;
        String longestString="";
        //array of palindrom
        for(int i=0;i<isPalindrome.length;i++){
            String temp=isPalindrome[i];
            System.out.println("Straight String:"+temp);
            String reverse="";
            int stringLength=isPalindrome[i].length();
            for(int j=stringLength-1;j>=0;j--){
                //System.out.println(j);
                reverse= reverse + temp.charAt(j);
                //break;

            }
            System.out.println("Reverse String is:"+reverse);
            boolean b1=reverse.equals(temp);
            if(b1=true){
                System.out.println("Palindrome String:" +reverse);
                if(reverse.length()>maxlength){
                    maxlength=reverse.length();
                    longestString=reverse;
                }
                else{
                    System.out.println("Not the Longest String:"+reverse);
                }
            }
            else{
                System.out.println("Not a Palindrome String! :" +temp);
            }
            

            
        }
        return longestString;
    }
    public static void main(String[] args){

        LongestPalindrome l1=new LongestPalindrome();

        String[] isPalindrome = new String[]{"aka", "abba","gattag", "sas", "sasa"};
        System.out.println("Longest Palindrome:"+ islongestPalindrome(isPalindrome));
    }
}