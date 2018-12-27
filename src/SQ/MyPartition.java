package SQ;

import java.util.ArrayList;

public class MyPartition
{
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>>  res = new ArrayList<ArrayList<String>>();
        ArrayList<String> cur = new ArrayList<>();
        dfs(s,cur,res);
        return res;
    }

    /**
     *  快速查找回文字符的方法
     */
    public static boolean isPartition(String s)
    {
       StringBuffer temp = new StringBuffer(s);
       temp.reverse();
       String newStr=new String(temp);
        return (s.equals(newStr));
    }

    private void dfs(String s, ArrayList<String> cur, ArrayList<ArrayList<String>> res) {
        if(s.length()==0)
        {
            res.add(new ArrayList<>(cur));//此处应特别注意
            //res.add(cur);   是错误的需要研究
        }

        for(int i = 1; i <= s.length(); i++)
            {
                String str = s.substring(0,i);

                if(isPartition(str))
                {
                    cur.add(str);
                    dfs(s.substring(i,s.length()),cur,res);
                    cur.remove(cur.size()-1);
                }
            }
    }


    public static  void main (String[] args)
    {

        MyPartition m = new MyPartition();
        System.out.println(m.partition("aab"));

    }





}
