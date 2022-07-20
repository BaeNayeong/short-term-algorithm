import java.util.*;
class 배나영_폰켓몬 {
    
    static HashMap<String, String> hash;
    
    public int solution(int[] nums) {
        
        hash=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            hash.put(nums[i]+"", "value");
        }
        
        return Math.min(hash.size(), nums.length/2);
    }
}