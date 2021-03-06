import java.util.*;
/**
 * You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line. 

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
Explanation
 */
public class Arraylist2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            
            rows.add(row);
        }
        
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}