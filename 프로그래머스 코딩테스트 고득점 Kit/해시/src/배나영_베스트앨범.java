import java.util.*;

class 배나영_베스트앨범 {
    
    static HashMap<String, PriorityQueue<Song>> songHash; // 곡장르-곡정보 해시
    static HashMap<String, Integer> ganreHash; // 장르별 재생수
    static ArrayList<Integer> result; 
    
    public int[] solution(String[] genres, int[] plays) {
        
        songHash=new HashMap<>();
        ganreHash=new HashMap<>();
        result=new ArrayList<>();
        
        for(int i=0; i<genres.length; i++){ // 노래 하나씩 확인해서 장르별 재생수 저장
            ganreHash.put(genres[i], ganreHash.getOrDefault(genres[i], 0)+plays[i]);
            PriorityQueue<Song> queue=songHash.getOrDefault(genres[i], new PriorityQueue<>()); // 장르의 큐 가져와서
            queue.add(new Song(plays[i], i)); // 큐에 넣고
            songHash.put(genres[i], queue);
            
        }
        
        while(!ganreHash.isEmpty()){
            maxSong(maxGanre());
        }
        
//        System.out.println("result 길이: "+result.size());
        int[] answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
    
    // 가장 많이 재생된 장르 리턴함
    public static String maxGanre(){
        
        int max=-1;
        String maxGanre=null;
        
//        System.out.println("maxGanre()");
        
        if(ganreHash.isEmpty()) {
        	System.out.println("ganreHash empty");
        }
        if(ganreHash.isEmpty()) return null; 
        
        for(String ganre: ganreHash.keySet()){
            if(ganreHash.get(ganre)>max){
                max=ganreHash.get(ganre); // 최댓값
                maxGanre=ganre;
            }
        }
        ganreHash.remove(maxGanre);
        return maxGanre;
        
    }
    
    // 한 장르에서 첫번째, 두번째로 재생수 많은 것 result에 저장
    public static void maxSong(String ganre){
        
        if(ganre==null) {
//        	if(ganreHash.isEmpty()) System.out.println("maxSong");
        	return; 
        }
        PriorityQueue<Song> songs=songHash.get(ganre);
        
        if(!songs.isEmpty()) {
//        	System.out.println("songHash is empty");
        	result.add(songs.poll().num);
        }
    	
        if(!songs.isEmpty()) 
        	result.add(songs.poll().num);
        
    }
    
    // 내림차순 정렬되도록 
    static class Song implements Comparable<Song> {
        int plays; // 재생수
        int num; // 곡 번호
        
        public Song(int plays, int num){
            this.plays=plays;
            this.num=num;
        }
        
        public int compareTo(Song other){
            return other.plays-this.plays;
        }
    }
   
}