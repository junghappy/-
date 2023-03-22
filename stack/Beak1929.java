package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Beak1929 {

	public static boolean[] arr;
 	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N+1];
				
		for (int i = M; i < N; i++) {
			prime(i);
			if(arr[i] == false) {
				System.out.println(i);
			}
		}

	}
	
	public static void prime(int i) {
		
		arr[0] = arr[1] = true;
		
		for (int j = 2; j <= Math.sqrt(i); j++) {
			
			if(arr[j] == true) {
				continue;
			}
			
			for (int k = j*j; k <= arr.length; k = k+j) {
				arr[k] = true;
			}
			
		}
		
	}

}
