import java.util.*;
class 배나영_위장 {
    
    static HashMap<String, Integer> hash;
    
    public int solution(String[][] clothes) {
        
        hash=new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            
            if(hash.containsKey(clothes[i][1])){
                hash.put(clothes[i][1], hash.get(clothes[i][1])+1);
            }
            else {
                hash.put(clothes[i][1], 1);
            }
        }
        
        int answer=1;
        
        for(String key: hash.keySet()){
            answer *= (hash.get(key)+1);
        }
        return answer-1;
    }
}