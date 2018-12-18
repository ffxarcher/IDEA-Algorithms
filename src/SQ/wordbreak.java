package SQ;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *    自底向上的动态规划
 */

public class wordbreak
{
    public boolean wordBreak(String s, Set<String> dict)
    {
        int len = s.length();

        Boolean[] mark = new Boolean[len+1];
        mark[0] = true;


        for(int i = 1; i <= len; i++)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                if(mark[j] && dict.contains(s.substring(j,i)))
                {
                    mark[i] = true;
                    break;
                }else
                {
                    mark[i] = false;
                }

            }
        }

         return  mark[len];
    }


    public static void main(String[] args)
    {
        wordbreak my = new wordbreak();

        String s ="leetcode";
        Set<String> dict =  new LinkedHashSet<String>();

        dict.add("leet");
        dict.add("code");


        System.out.println(my.wordBreak(s,dict));
    }



}
