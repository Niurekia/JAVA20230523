package Ch07;

import java.util.Scanner;

public class C00While {

	public static void main(String[] args) {
		
		
		
		
		//01 반복문 기본
		
//		int i=1;		// 1 탈출용 변수
//		while(i<=10) 	// 2 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("i : " + i);
		

		//02 1 - 10까지의 합
		
//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=10) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
		
		//04 1 - N 까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=n) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		sc.close();
		
		//문제
		// N - M 까지의 합을 구합니다.(N<M)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i=n;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=m) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		sc.close();
		
		
		
		//01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		int odd=0;		//홀수 누적합용 변수
//		int even=0;		//짝수 누적합용 변수
//		while(i<=n) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum +=i;
//			if(i%2==0) {
//				even+=i;
//			}else {
//				odd+=i;
//			}
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		System.out.println("짝수합 : " + even);
//		System.out.println("홀수합 : " + odd);
//		sc.close();
		
		//1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n)
//		{
//			if(i%3 == 0) {
//				System.out.println("i : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : "  + sum);
		
		
		//1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n)
//		{
//			if(i%4 == 0) {
//				System.out.println("i : " + i);
//				
//			}else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : "  + sum);
		
		//구구단 2 단출력
		//구구단 N 단출력(N<=9)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = 1;
//		int dan = sc.nextInt();
//		while(i<=9)
//		{
//			System.out.println(dan + " x " + i + " = " + (dan*i));
//			i++;
//		}
		
		//구구단 N 단 역순출력(N<=9)
		//ex) 2단
		// 2 x 9 = 18
		// 2 x 8 = 16
		// ..
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = 9;
//		int dan = sc.nextInt();
//		while(i>=1)
//		{
//			System.out.println(dan + " x " + i + " = " + (dan*i));
//			i--;
//		}
		
// --------------------------------------------------------------------------------------
		
		//중첩 while 
		
		//전체 구구단 출력
		//2 - 9 단 출력
		
//		int dan=2;
//		int i=1;
//		
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//전체구구단 역순출력
//		int dan=2;
//		int i=9;
//		
//		while(dan<=9)
//		{
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}	
		
		int dan=9;
		int i=9;
		
		while(dan>=2)
		{
			i=9;
			while(i>=1) {
				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
				i--;
			}
			System.out.println();
			dan--;
		}
		

	}

}
