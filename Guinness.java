package baekjoon;

public class Guinness {
	private static Guinness g; //인스턴스
	private static int renew = 0;
		// 기록의 갱신 수, 객체 전체가 이 값을 공유한다.
	private int value, count;
	   // 최고 기록과 그 기록이 유지된 수, 인스턴스가 생성될 때마다 갱신된다.
	
	//생성자
	public Guinness(int m) {
	  //최고 기록을 갱신하고, 유지 수를 초기화하며, 갱신 수를 증가한다.
	}
	
	public static Guinness getInstance(int m) {
		//최초 1번은 무조건 인스턴스를 생성한다.
		//이후에는 최고 기록마다 인스턴스를 생성한다.
		
		if(g == null || m > g.value) { //들어온값이 전 최고기록 값보다 크면 기록 최신화, 갱신++
			g = new Guinness(m);
			g.value = m;
			renew++;
			g.count++;	
		}else {
			g.count++;	
		}

		//그 외에는 유지 수를 증가한다.
		return g;
	}
	
	//최고 기록, 갱신 수, 유지 수를 가져온다.
	public int getValue() {
		return value;
	}
	
	public int getRenew() {
		return renew;
	}
	
	public int getCount() {
		return count;
	}
}
