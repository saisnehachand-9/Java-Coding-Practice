public class Main{
    public static  String longestCommonPrefix(String[] strs) {
        String res="";
        
            String s1=strs[0];// flower
            for(int k=0;k<s1.length();k++)
            {
                int c=0;
                for(int j=1;j<strs.length;j++)
                {
                    if(k<strs[j].length()){
                    if(s1.charAt(k)==strs[j].charAt(k))
                          c++;
                    }
                }
                if(c==strs.length-1)
                    res=res+s1.charAt(k);
                    if(c!=strs.length-1)
                       return res;
        }
        return res;
    }
    public static void main(String args[])
    {
        String arr[]={"ba","b","b"};
        System.out.println(longestCommonPrefix(arr));
   }
}