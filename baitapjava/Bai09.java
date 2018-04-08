package baitapjava;

public class Bai09 {
	public static void main(String[] args) {
		String str="A Dog has 2 ears";
		System.out.println("Chuỗi gốc: "+str);
		System.out.println("Chuỗi mới: "+str.replaceAll("Dog", "Cat"));
	}
}
