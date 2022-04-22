package ch07_array;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 (Array)
		
		String samjang = "서유기: 삼장";
		String woogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		// 문자(String) 배열
		// 배열의 선언 1
		// 숫자 4는 첨자를 의미하며,
		// 배열의 크기(4)를 의미한다.
		String[] seoyugi = new String[4];
		
		//. length 배열의 크기를 리턴
		System.out.println(seoyugi.length);
		
		// 배열 내 요소(element)의 값 확인
		// 인덱스 사용 (= 인덱싱)
		System.out.println(seoyugi[2]);
		
		// 크기만 선언된 배열 내에는 기본값이 들어있다.
		
		// 기본값 (default, 디폴트)
		// 참조타입: null
		// 기본타입(숫자형, boolean)
		// 숫자타입: 정수는 0, 실수는 0.0
		// boolean타입: false
		int[] numbers = new int[2];
		System.out.println(numbers[1]);
		
		// for문을 이용하여 0부터 array.length 미만까지
		// 순회하면 배열의 모든 요소에 접근이 가능하다
		for(int i = 0; i < seoyugi.length; i++) {
			System.out.println(seoyugi[i]);
		}
			System.out.println("\n=====================================================\n");
			
			// 배열에 값 넣기
		seoyugi[0] = samjang;
		seoyugi[1] = "손오공";
		
		printArray(seoyugi);
		
		seoyugi[2] = "사오정";
		seoyugi[3] = "저팔계";
		
		printArray(seoyugi);
		
		// 배열의 단점
		// 크기가 고정됨!!!!!!!!!!!!!!!
		// 늘어나지도, 줄어들지도 않는다.
		// = 값이 추가되지 않고, 값을 제거도 못한다.
		
		// 빨간줄 에러는 컴파일 에러로,
		// 실행을 안해봐도 이클립스가 캐치
		// 실행했을 경우 발생하는 에러는 런타임 에러
//		seoyugi[4] = "크리링";
		
		// 배열의 장점
		// 배열에 담긴 모든 요소들을 한번에 처리할 수 있다.
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기" + seoyugi[1];
		}
		printArray(seoyugi);
		
		// 배열 내 특정 요소에 접근하여 처리할 수 있다.
		for(int i = 0; i < seoyugi.length; i++) {
			// 손오공임?
			// seoyugi[i].contains("손오공")
			if(seoyugi[i].indexOf("손오공") != -1) {
				
			// 그럼 서유기를 드래곤볼로 바꿔
			seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		} 
		printArray(seoyugi);
		
		System.out.println("\n======================\n");
		
		int[] intArray = new int[6];
		
//		printArray(intArray);
		
		// 배열 안에 랜덤 숫자 넣기
		// 로또 번호 넣어주기
		// 1~45 사이의 랜덤 정수
		
//		printArray(intArray);
//		
//		int printArray [] = new int[45];	//1~45 정수를 담을 배열을 생성
//		
//		for(int i=0; i < ball.length; i++) {
//			int randInt = (int)(Math.random() * 45) + 1;
//			intArray[i] = randInt;	
						    
//		}
		
//		printArray(intArray);
		
		System.out.println("\n======================\n");
		
		// 배열의 선언 2번째
//		String[] students = {"송나겸", "남궁혜연", "김달현");
		
		String[] stu = new String[3];
		stu[0] = "송나겸";
		stu[1] = "남궁혜연";
		stu[2] = "김달현";
		
//		printArray(students);
		
		//문자열 나누기
		System.out.println("\n======================\n");
		
		String myInfo = "정찬웅 , 010-7398-7332, akow283@gmail.com";
		
		// .sqlit(문자열)
		// 괄호안 문자열을 기준으로 해당 문자열을
		// 나누어 문자열 배열로 리턴한다.
		String[] infoArray = myInfo.split(", ");
		System.out.println(infoArray.length);
		System.out.println(infoArray[0]);
		System.out.println(infoArray[1]);
		System.out.println(infoArray[2]);
		
		// 데이터가 거지같다면 ,로 일단 나누고
		// 이후 양쪽 공백을 제거해주면 된다.
		for(int i = 0; i < infoArray.length; i++) {
			infoArray[i] = infoArray[i].trim();
		}
		printArray(infoArray);
		
		System.out.println("\n======================\n");
		
		String calStr = "1+4+2";
		String[] calArray = calStr.split("\\+");
		// regex란 정규표현식(Regular Expression)의 약자
		// *, ?, + 의 경우 정규표현식에서 특정 의미를
		// 가지는 특수문자이므로 일반 문자로 쓰려면
		// 앞에 \\를 붙인다.
		
		// 정규표현식 사용 예
		// 연락처를 숫자만 기입했는지 체크
		// 비밀번호에 알파벳 소문자, 대문자, 숫자, 특수기호 최소 1개 이상 넣었는지 체크
		printArray(calArray);
		
		System.out.println("\n===============================\n");
		
		// 배열의 복사
		String[] sinSeoyugi = seoyugi;
		printArray(seoyugi);
		printArray(sinSeoyugi);
		
		sinSeoyugi[0] = "이승기";
		sinSeoyugi[1] = "이수근";
		printArray(seoyugi);
		printArray(sinSeoyugi);
		
		// @뒤에 붙은건 hashCode를 16진수로 나타낸 것
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		System.out.println(seoyugi.hashCode());
		System.out.println(sinSeoyugi.hashCode());
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		// 해쉬코드(hashcode)
		// 객체의 메모리 주소값을 이용해서
		// 해쉬를 적용한 코드
		
		// 해쉬(hash)
		// 해쉬함수(암호화 알고리즘)를 이용해서
		// 데이터를 암호화하는 기법(RSA, SHA 등 ....)
		
		// 암호화, 복호화 정말 쉽다.
		// 암호화
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4";
		// 문자열을 byte 배열로 변환
		byte[] passByte = password.getBytes();
		String encryption = new String(base64Encoder.encode(passByte));
		System.out.println(encryption);
		
		// 복호화
		Decoder base64Decoder = Base64.getDecoder();
		String decryption = new String(base64Decoder.decode(encryption));
		System.out.println(decryption);
		
		// 암호화시 사용된 알고리즘 (여기선 base64)
		// 과 일치하는 알고리즘을 이용하여
		// 복호화해야한다는 것에만 주의
		
		System.out.println("\n==================\n");
		
		// 올바른 배열 복사
		String[] synSeoyugi2 = seoyugi.clone();
		synSeoyugi2[0] = "안재현";
		
		printArray(seoyugi);
		printArray(synSeoyugi2);
		
		// clone을 까먹었어요
		String[] synSeoyugi3 = new String[seoyugi.length];
		// synSeoyugi3의 각각의 요소에
		// seoyugi의 각각의 요소를 넣으면 됨
		
			for(int i = 0; i < synSeoyugi3.length; i++) {
				synSeoyugi3[i] = seoyugi[i];
			}
			printArray(synSeoyugi3);
		
		
		
			
	} // main 끝
	
	
	
//	static void printArray(int[] intArray) {
//		for(int i = 0; i < printArray.length; i ++) {
//			if(i == printArray.length-1) {
//				System.out.println(printArray[i]);
//			}else {
//				System.out.print(printArray[i] + ", ");
//		}
//	}
//}
	static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i ++) {
			if(i == strArray.length-1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");
			}
		}
	}
}
