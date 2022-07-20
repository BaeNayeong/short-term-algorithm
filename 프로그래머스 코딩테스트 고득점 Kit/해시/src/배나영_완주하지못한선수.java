import java.util.*;
class 배나영_완주하지못한선수 {
    
    static HashMap<String, Integer> hash;
    
    public String solution(String[] participant, String[] completion) {
        
        hash=new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            if(hash.containsKey(participant[i])){
                hash.put(participant[i], hash.get(participant[i])+1);
            }
            else {
                hash.put(participant[i], 1);
            }
        } // 참가자 입력
        
        for(int i=0; i<completion.length; i++){
            hash.put(completion[i], hash.get(completion[i])-1); // 수 줄이기
        }
        
        for(int i=0; i<participant.length; i++){
            if(hash.get(participant[i])!=0) return participant[i];
        }
        return null;
    }
}