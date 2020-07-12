import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		// ArrayListはどんな方のインスタンスでも格納できるがインスタンスでないものは格納できない
		// 基本データを格納したい場合はwrapperクラスを用いることで格納することができる
		// wrapperクラスは型によって違うクラスを使う
		// 以下はIntegerクラスを使って格納している
		ArrayList<Integer> points = new ArrayList<Integer>();
		// 要素を格納する際にはadd()またはset()を使う
		// add()は、追加する要素だけ引数に渡すと末尾に追加される
		// また、0から始まるint値と要素の二つを渡すと、
		// add()では、intの位置に要素が挿入される
		// set()では、指定位置の要素を上書きして置き換え、古い要素を戻り値として返す。
		points.add(10);
		points.add(80);
		points.add(75);
		// 要素はget()で取り出すことができる
		System.out.println("pointsの一番初めの要素の数字は"+ points.get(0));
		// ArrayListの要素数を調べる際はsizeメソッドを使う
		// 要素が0かどうか調べる際はisEmptyを使った方が可読性が上がる
		System.out.println("pointsの要素数は"+ points.size());
		// containsメソッドを使えば引数の内容が格納されているかどうか調べることもできる
		System.out.println(points.contains(10));
		// indexOfメソッドを使えば何番目に格納されているのかを調べることもできる
		// 以下では先頭が0になるためわかりやすくなるよう+1をしている
		System.out.println("pointsのなかで10が格納されているのは"+ (points.indexOf(10)+1) +"番目です");
		for(int i: points) {
			System.out.println(i);
		}
		// removeメソッドを使うことによって要素を削除することができる
		// 要素を削除した場合、後ろの要素が一つずつ前に詰められる
		// また、全て削除したい場合は、clearメソッドを使う
		points.remove(0);
		System.out.println("pointsの先頭の要素は"+ points.get(0));

		 ArrayList<String> names = new ArrayList<String>();
		 names.add("湊");
		 names.add("朝香");
		 names.add("菅原");

		 // forや拡張for文、また、Iteratorを用いることによって要素を順番に取り出すこともできる
		 // Iteratorは先頭から要素を取り出し次の箱を指し、次の要素を取り出すといった形で一つずつ取り出す
		 // 呼び出されると、最初の要素よりももっと前を指した状態が取得される
		 Iterator<String> it = names.iterator();
		 // 次の要素に進めるかを判定
		 while(it.hasNext()) {
			 // 次の要素を指し、その内容を返す
			 String e = it.next();
			 System.out.println(e);
		 }

		// 基本型とラッパークラスを変換したい場合はvalueOf()やValue()を使う
		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue();
	}
}
