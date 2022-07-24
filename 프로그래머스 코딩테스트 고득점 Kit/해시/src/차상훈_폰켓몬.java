import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = nums.length/2;
        Set<Integer> map = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            map.add(nums[i]);
        }
        System.out.println(map);
        
        if(map.size()>sum){
            answer = sum;
        }else{
            answer = map.size();
        }
        return answer;
    }
}