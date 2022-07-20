
public class 배나영_디스크컨트롤러 {
	
	
	
	
	// Job 자료구조
	public class Job implements Comparable<Job>{
		int time;
		int need;
		
		public Job(int time, int need) {
			this.time=time;
			this.need=need;
		}

		@Override
		public int compareTo(Job o) {
			
			int tTime=this.need-this.time;
			int oTime=o.need-o.time;
			
			return tTime-oTime;
		}
	}

}
