package dynamic_programming;

import java.util.Scanner;

public class Q_9095 {
	public static void main(String[] args) {
		int T;
		
		int[] numcase=new int[11];
		numcase[0]=0;
		numcase[1]=1;//정수가 1일때 경우의 수 :1
		numcase[2]=2;//정수가 2일때 경우의 수 :2
		numcase[3]=4;//정수가 3일때 경우의 수 :3
		
		int num;
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		
		for(int i=0;i<T;i++){
			num=sc.nextInt();
			
			for(int j=4;j<=num;j++){
				numcase[j]=numcase[j-1]+numcase[j-2]+numcase[j-3];
			}
			System.out.println(numcase[num]);
			
		}
		
		
		
	}
	
//	public static void plus(int num){
//		int N=0;
//		
//		if(num==0){
//			return;
//		}
//		else{
//			
//			for(int i=1;i<num;i++){
//				plus(--num);
//			}
//			N++;
//			
//		}
//		
//		System.out.println(N);
//	}
}
