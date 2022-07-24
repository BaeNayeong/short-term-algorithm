import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String part : participant){
            map.put(part, map.getOrDefault(part, 0)+1); // 수정 코드
            // if(map.get(part) != null){
            //     map.put(part, map.getOrDefault(part, 0)+1);
            // }else{
            //     map.put(part,1);   
            // }
        }
        
        for(String part : completion){
            map.put(part, map.get(part)-1);
        }
        //System.out.println(map);
        
        //Set<Integer> keySet = map.keySet();
        Set<String> keyset = map.keySet();
        for(String key : keyset){
            if(map.get(key) == 1){
                answer += key;
            }
        }
        
        // Collection<Integer> values = map.values();
        // for(Integer val : values){
        //     System.out.println(val);
        // }
        return answer;
    }
}