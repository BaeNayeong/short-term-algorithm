import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        PriorityQueue<Integer> Maxpq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(String str : operations){
            StringTokenizer st = new StringTokenizer(str);
            String check = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            
            if(pq.size() < 1 && check.equals("D")) continue;
            
            if(check.equals("I")){
                pq.offer(value);
                Maxpq.offer(value);
                continue;
            }
            
            if(value < 0){
                int min = pq.poll();
                Maxpq.remove(min);
                continue;
            }
            
            int max = Maxpq.poll();
            pq.remove(max);
            
        }
        
            if(pq.size() > 0 ) {
            answer[0] = Maxpq.poll();
            answer[1] = pq.poll();
            }       
        
        return answer;
    }
}