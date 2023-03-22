package baekjoon;

public class Deq {
	static int MX = 1000005;
	static int dat[] = new int[2*MX+1];
	static int head = MX, tail = MX;
	
	public static void main(String[] args) {
		push_front(1);
		push_front(2);
		push_front(3);
		push_back(7);
		push_back(8);
		push_back(9);
		test();
	}
	
	public static void push_front(int x) {
		dat[--head] = x;
	}
	public static void push_back(int x) {
		dat[tail++] = x;
	}
	public static void pop_front() {
		head++;
	}
	public static void pop_back() {
		tail--;
	}
	public static int front() {
		return dat[head];
	}
	public static int back() {
		return dat[tail-1];
	}
	public static void test() {
		for (int i : dat) {
			if(i != 0) {
				System.out.print(i + " ");
			}
		}
	}
	

}
