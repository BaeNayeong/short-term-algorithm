import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int k : scoville){
            pq.add(k);
        }
        
        while(pq.peek() <= K){    
            if(pq.size() == 1) return -1;
            
            int value1 = pq.poll();
            int value2 = pq.poll();
            int totalcnt = value1 + value2*2;
            pq.add(totalcnt);
            answer++;
        }
        return answer;
    }
}
