package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class lcswithnorepeated {
    public static int  nonrep(String s) {
        Map<Character,Integer>hm= new HashMap<>();
        int start=0,res=0;
        for(int i=0;i<s.length();i++)
        {
            System.out.println(hm);
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                start=Math.max(start,hm.get(ch)+1);
            }
            hm.put(ch, i);
            res=Math.max(res, i-start+1);
        }
        return res;
        
    }
    public static void main(String[] args) {
        System.out.println(nonrep("abbb"));
    }
}