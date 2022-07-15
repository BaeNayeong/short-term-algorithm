import java.util.*;

class 배나영_이중우선순위큐 {
    
    static PriorityQueue<Integer> minQueue;
    static PriorityQueue<Integer> maxQueue;
    
    public static int[] solution(String[] operations) {
        
        minQueue=new PriorityQueue<>();
        maxQueue=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<operations.length; i++){
            StringTokenizer st=new StringTokenizer(operations[i], " ");
            String commend=st.nextToken();
            
            if(commend.equals("I")) {
                int num1=Integer.parseInt(st.nextToken());
                minQueue.add(num1);
                maxQueue.add(num1);
            }
            else if(commend.equals("D")) {
            	
                if(minQueue.isEmpty()) continue;
                
                if(st.nextToken().equals("1")){
                    int num=maxQueue.poll();
                    minQueue.remove(num);
                }
                
                else {
                    int num=minQueue.poll();
                    maxQueue.remove(num);
                }
            }
        }// end for
        
        if(minQueue.isEmpty() && maxQueue.isEmpty()) return new int[]{0,0};
        return new int[]{maxQueue.poll(), minQueue.poll()};
        
    }//end solution
    
    public static void main(String[] args) {
		
    	String[] operations=new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
    	int[] result = solution(operations);
    	System.out.println(result[0]+","+result[1]);
	}
}