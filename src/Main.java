import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		// CollectionインターフェースにはListインターフェース (ArrayListクラスやLinkedListクラス)の他に
		// Setインターフェース(HashSetクラスやLinkedHashSetクラスやTreeSetクラス)もある
		// Set関連クラスは複数の情報を重複なく格納する集合(Set)というデータ構造を実現するためのもので
		// それぞれの要素に順序がないことが一般的である
		// Setはそれぞれの要素には重複が許されない、また順序関係がない
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("緑");
		colors.add("黒");
		// 赤は既に格納されているため格納されない
		colors.add("赤");
		System.out.print("HashSet:");
		// 順序関係がないためget()やset()は使えない
		// HashSetに格納された値は拡張for文やIteratorが使って取り出せるが取り出される順序は保証されない
		for(String s: colors) {
			System.out.print(s +"→");
		}

		System.out.println();
		// LinkedHashSetであれば値を格納した順序に整列する
		Set<String> colors2 = new LinkedHashSet<>();
		colors2.add("赤");
		colors2.add("青");
		colors2.add("緑");
		colors2.add("黒");
		System.out.print("LinkedHashSet:");
		for(String s: colors2) {
			System.out.print(s +"→");
		}

		System.out.println();
		// TreeSetであれば自然順序づけで整列する
		Set<String> animals = new TreeSet<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("wolf");
		animals.add("panda");
		System.out.print("TreeSet:");
		for(String s: animals) {
			System.out.print(s +"→");
		}
	}
}
