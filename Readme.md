# JavaSE

***

### 객체란?   
실제로 존재 또는 추상적으로 식별가능한 모든것   
최소한의 프로그램 단위.   

Java - 객체 설계도를 만든다. (a.k.a 와플틀)   
```
class 클래스명{

}
```

객체를 만드는방법(객체생성) --> 메모리에 객체를 올린다. --> 인스턴스화   
 * 클래스명(타입) 변수명 = new 클래스명();   

### 객체 구성요소
  - 변수 - 특징, 속성 값
  	- 타입   
  		- 기본형(8개) - boolean, byte, char, short, int, long, float, double(stack메모리생성)  
  		- 참조형 - 기본형 외 모든 변수 --> 객체 주소값 가지고 있는 변수 (heap메모리생성)
  	- 선언위치  
  		- 전역변수 - 클래스에 종속. 멤버변수 
  				- !초기화 하지 않으면 
  					- 참조형 null 값 
  					- 기본형은 default 값 boolean(false) 정수형(0) 실수형(0.0) 
  		- 지역변수 - 메소드 안에 선언. !주의 초기값 대입없을시 컴파일 에러 발생!! 초기화 필수!!!
  	- 동적/정적











