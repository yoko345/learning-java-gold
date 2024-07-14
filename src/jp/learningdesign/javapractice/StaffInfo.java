package jp.learningdesign.javapractice;

class Staff {
	String name;
	int staffId;
	String email;
	
	public void sayHello() {
		System.out.println("Hello! " + this.name);
	}
}

public class StaffInfo {
	public static void main(String[] args) {
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
//		yamada.staffId = "aaa"; # エラーになる
		
		yamada.sayHello();
		
//		System.out.println(yamada.name);
	}
}
