package SQ;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *自底向上的动态规划  从后向前检查
 */
public class wordbreak2
{
    ArrayList<String> arrayList = new ArrayList<>();


    public ArrayList<String> wordBreak2(String s, Set<String> dict)
    {
       dfs(s,s.length(),"",dict);
//        dfs(s,0,"",dict);
       return arrayList;
    }

   public  void dfs(String s, int index,String str,Set<String> dict)
    {
        if(index <= 0)
        {
            if(str.length() > 0)
            {
                arrayList.add(str.substring(0,str.length()-1));
            }
        }


        for(int i = index; i >= 0 ;i-- )
        {
                if(dict.contains(s.substring(i,index)))
                {
                    dfs(s,i,s.substring(i,index)+" "+str,dict);
                }
        }
    }

 /*  public  void dfs2(String s, int index,String str,Set<String> dict) {

        if ( index >= s.length() - 1 ) {
            if (str.length() > 0)
            {
                 arrayList.add(str.substring(0, str.length() - 1));
            }
        }


        for (int i = index; i < s.length(); i++)
        {
            if (dict.contains(s.substring(index,i+1)))
            {
                dfs2(s, i, str + s.substring(index, i+1) + " ", dict);
            }
        }


    }*/


    public static void main(String[] args)
    {
        wordbreak2 my = new wordbreak2();

        String s ="catsanddog";
        Set<String> dict =  new LinkedHashSet<String>();

        dict.add("cat");
        dict.add("cats");
        dict.add("sand");
        dict.add("dog");
        dict.add("and");


        System.out.println(my.wordBreak2(s,dict).get(0)+"&&"+my.wordBreak2(s,dict).get(1));


    }



}
