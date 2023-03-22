package baekjoon;

import java.io.BufferedReader; 

import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.IOException;

public class Baek10809 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};

		String s = br.readLine();
		int[] outNum = new int[arr.length];
		int cnt = -1;
		
		for(int i = 0; i < arr.length; i++) { //입력 문장
			for(int j = 0; j < s.length(); j++) {//입력문장과 비교위함
				cnt++;
				if(s.charAt(j) == arr[i]) {
					outNum[i] = j;
					break;
				}else {
					outNum[i] = -1;
				}
				cnt = 0;
			}
		}	
		for (int a : outNum) {
			System.out.print(a + " ");
		}
	}

}
