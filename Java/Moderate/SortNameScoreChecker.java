import java.util.*;
/**
 * Collections.sort(Collection, Comparator) and Collections.sort(Collection) are overloaded method. And we need to use the first form here, which will take a Comparator as the second parameter, since reference type does not have a natural ordering.

The Comparator interface consists of a single method.

public interface Comparator<T> {
    int compare(T o1, T o2);
}
The compare method compares its two arguments, returning a negative integer, 0, or a positive integer depending on whether the first argument is less than, equal to, or greater than the second.

As we need decreasing order, therefore the comperator should return a positive value when the order appears to be increasing, so that it will change the order and make it decreasing again. Hence, b.score - a.score.
https://www.hackerrank.com/challenges/java-comparator/forum
 */
// Write your Checker class here
class Checker implements Comparator<Player>{
    public int compare(Player a,Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);//Alphabetically sorting
        }else
            return b.score-a.score;//Decreasing Score order
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}