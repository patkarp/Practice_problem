
/**
 * 




0

avatar
Premium
Debugging...
Debugging...








Run






Description

Editorial
Editorial

Solutions
Solutions

Submissions
Submissions

Code

Testcase
Testcase

Test Result
1859. Sorting the Sentence
Easy

Topics
Companies

Hint
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.
 */
import java.util.LinkedHashMap;

public class SortingSentence {
    static public String sortSentence(String s) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        int key;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();){
            StringBuilder word= new StringBuilder();
            while(i<s.length()&&!Character.isDigit(s.charAt(i))){
                word.append(s.charAt(i));
                i++;
            }
            key=Character.getNumericValue(s.charAt(i));
            i++;
            lhm.put(key,word.toString().trim());

        }
        for(int j=1;j<=lhm.size();j++){
            sb.append(lhm.get(j));
        
        if (j < lhm.size()) {   
              sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));

    }

}

