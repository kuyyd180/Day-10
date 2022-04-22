package dallhyun.submit06;

public class Answer {

	public static void main(String[] args) {
		
		// 십진수를 이진수(String 타입)으로 리턴해주는
		// makeBinary 함수
		
		String binaryString = Integer.toBinaryString(23);
		System.out.println(binaryString);
		System.out.println(makeBinary);
		
		String hexString = Integer.toHexString(23);
		System.out.println(hexString);
		
		
		
		
	} // main 끝
	
	static String reverse(String str)	
	
	// 로꾸꺼 
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.substring(i,i+1);	
		}
		
	static String makeBinary(int num) {
		// 30이 들어왔다.
		// 30을 2로 나눠서 나머지 0 / 몫은 15
		// 15를 2로 나눠서 나머지 1 / 몫은 7
		// 7을 2로 나눠서 나머지 1 / 몫은 3
		// 3을 2로 나눠서 나머지 1 / 몫은 1
		
		String result = "";
		while(true) {
			result += num % 2;
			if(num == 1) {
				break;
			}
			
			num /= 2;
		}
		String reverseResult = (reverse);
		return result;
	}
	
	
}
