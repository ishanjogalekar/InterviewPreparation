package stringExamples;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        //All roman characters and their respective int values in array ordered
        String roman = "IVXLCDM";
        int[] vs = {1,5,10,50,100,500,1000};

        //Add roman characters and values in hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < vs.length; i++){
            map.put(roman.charAt(i), vs[i]);
        }

        int res = 0;
        for(int i = 0; i < s.length(); i++){
            //if current value less than next value , subtract from next and add it rest
            if(i+1<s.length() && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                res += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }
            //else add as it is in res
            else{
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("ID"));
    }
}
