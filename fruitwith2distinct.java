package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class fruitwith2distinct {
    public static int  solve(String s,int k) {
        int start=0,res=0;
        Map<Character,Integer>hm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
            System.out.println(hm);
            while(hm.size()> k)
            {
                
                char left=s.charAt(start++);
                hm.put(left,hm.get(left)-1);
                if(hm.get(left)==0)
                {
                    hm.remove(left);
                }
            }
            res=Math.max(res,i-start+1);
        }
        return res;
        
    }
    public static void main(String[] args) {
        System.out.println(solve("abcbbc",2));
    }
}