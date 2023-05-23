package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단축키 
		//복사 : ctrl + alt + ↓
		//주석 : ctrl + /
		
		//System : OS
		//System.out : OS가 관리하는 표준 출력 스트림
		
		
		//System.out.print()
		//ESCAPE문자 : 
		// \n : 개행,줄바꿈
		// \b : 백스페이스
		// \t : 탭길이(기본 8칸) 만큼 커서이동
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HE\tLLOW\tORLD");
		
		
		//System.out.printf()
		
		System.out.printf("%d %d %d \n"	,10,20,30);
		System.out.printf("%f %f %f \n"	,10.1,20.1,30.1);
		System.out.printf("%c %c %c\n"	, 'A','B','C');
		System.out.printf("%s %s %s\n"	, "This is"," String ", "Test");
		System.out.printf("%d.%s : %d\n", 1, "국어",100);
		
		
		//System.out.println()
		
		
		
	}

}
