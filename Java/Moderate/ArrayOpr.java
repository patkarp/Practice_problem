class ArrayOpr{
    //Search, Insert and Delete Operation
    static boolean search(int searchint, int[] arr){
        for(int i=0;i<arr.length;i++){  
            if(arr[i]==searchint){
                return true;
            }else return false;
        }
        return false;
    }

    static int insert(int n, int key, int[] arr){
        if(n>arr.length)
            return n;
        arr[n]=key;
        return (n+1);
        
    }

    

   public static void main(String[] args) {
        ArrayOpr opr = new ArrayOpr();
        int arr[]=new int[]{20,30,40,50,60};

        Boolean s = search(20, arr);
        if(s == true) System.out.println("Found");
        else System.out.println("Not  Found");

        int n=6,key=26;
        n = insert(n, key, arr);
        for(int j; j<arr.length;j++) System.out.print(arr[j]);
        

    }
}