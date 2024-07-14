package jp.learningdesign.javapractice;

class Staff {
	String name;
	int staffId;
	String email;
}

public class StaffInfo {
	public static void main(String[] args) {
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
		System.out.println(yamada.name);
	}
}
