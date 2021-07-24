
// Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.
// t(c)=o(n^2)
// space=0(n)
import java.util.*;

public class MaximumProductOfWord {
    static int findMaxValue(String words[])
    {
        int n=words.length;
        int temp[]=new int[n]; //It is used to calculate the every String value.
        for(int i=0;i<n;i++)
        {
            temp[i]=countState(words[i]);
        }

        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((temp[i]&temp[j])==0)
                {
                    max=Math.max(words[i].length()*words[j].length(),max);
                }
            }
        }
        return max;
    }

    static int countState(String s) {
        int count=0;
        for(char c:s.toCharArray())
        {
           int val= c-'a';
           count|=1<<val;
        }
        return count;
        
    }

    public static void main(String[] args) {
        // String words[]={"abcw","baz","foo","bar","xtfn","abcdef"};
        String words[]={"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(findMaxValue(words));
    }
    
}
