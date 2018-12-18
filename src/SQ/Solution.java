package SQ;

public class Solution
{
    public int singleNumber(int[] A) {

        int result = 0;

        for(int i = 0; i < A.length; i++)
        {
            result ^= A[i];
        }
        return result;
    }



    public static void main(String[] args)
    {
        Solution my = new Solution();

        int[] a = {1,0,1};

        System.out.println(my.singleNumber(a));
    }


}
