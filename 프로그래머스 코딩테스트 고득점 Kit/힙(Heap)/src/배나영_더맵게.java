import java.util.*;
class 배나영_더맵게 {
    
    int result;
    PriorityQueue<Integer> queue;
    
    public int solution(int[] scoville, int K) {
        
        result=0;
        queue=new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            queue.add(scoville[i]);
        }
        
        while(true){
            if(queue.peek()>=K) break; 
            if(queue.size()==1) return -1;
            
            int sum=queue.poll();
            sum+=(queue.poll()*2); // 스코빌 지수
            result++;
            queue.add(sum); // 더한 것 넣기
        }
        
        return result;
    }
}