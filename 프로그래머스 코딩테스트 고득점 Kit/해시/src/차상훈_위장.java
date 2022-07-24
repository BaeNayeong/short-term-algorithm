import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        //System.out.println(clothes.length);
        for(int i = 0; i<clothes.length; i++){
            String cloth = clothes[i][1];
            if(!map.containsKey(cloth)){
                map.put(cloth, 1);
            }else{
                map.put(cloth, map.get(cloth)+1);
            }
        }
        System.out.println(map);
        Collection<Integer> set = map.values();
        for(int n : set){
            answer *= n+1;
        }
        //Collection<Integer> values = map.values();
        return answer-1;
    }
}