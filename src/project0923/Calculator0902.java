package project0923;




public class Calculator0902 {

	
	 int result = 0; 
    int add(int num) 
	{ result += num; return result; } 
	public static void main(String[] args)
	{ Calculator0902 cal1 = new Calculator0902(); // 계산기1 객체를 생성한다.  객체는 서로 독립적으로 기능함

	  Calculator0902 cal2 = new Calculator0902(); // 계산기2 객체를 생성한다. static없으므로 method실행시 객체필요

	     System.out.println(cal1.add(3)); System.out.println(cal1.add(4));

	            // static없는데 4가아니고 7이되는가?객체니까 그렇게되는건가  .. 클래스면 생성자때매 초기화되니까 필요한건가

	     System.out.println(cal2.add(3)); System.out.println(cal2.add(7)); } }