import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// ArrayListはどんな方のインスタンスでも格納できるがインスタンスでないものは格納できない
		// 基本データを格納したい場合はwrapperクラスを用いることで格納することができる
		// wrapperクラスは型によって違うクラスを使う
		// 以下はIntegerクラスを使って格納している
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for(int i: points) {
			System.out.println(i);
		}
		// 基本型とラッパークラスを変換したい場合はvalueOf()やValue()を使う
		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue();
	}
}
