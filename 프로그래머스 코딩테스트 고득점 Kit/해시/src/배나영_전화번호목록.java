import java.util.*;
class 배나영_전화번호목록 {
    
    static HashMap<String, Integer> hash;
    
    public boolean solution(String[] phone_book) {
        
        hash=new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++){
            hash.put(phone_book[i], i);
        }
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(hash.containsKey(phone_book[i].substring(0, j)) // substring포함했는지
                   && i!=hash.get(phone_book[i].substring(0, j))){ // 자기 자신이 아닌
                    return false;
                }
            }
        }
        
        return true;
    }
}