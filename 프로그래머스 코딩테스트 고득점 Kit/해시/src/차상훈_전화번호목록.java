import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new TreeMap<>();
        
        for(String str : phone_book){
            map.put(str, 1);
        }
        
        // for(int i =0; i<phone_book.length; i++){
        //     for(int j =0; j<phone_book[i].length(); j++){
        //         if(set.contains(phoneBook[i].substring(0,j))){
        //             answer = false;
        //             return answer;
        //         }
        //     }
        // }
        
        for(int i = 0; i<phone_book.length; i++){
            for(int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    System.out.println(phone_book[i].substring(0,j));
                    answer = false;
                    return answer;
                }
            }
        }
        //System.out.println(map);
        return answer;
    }
}