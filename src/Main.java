import java.util.ArrayList;
import java.util.List;

class Hero{
	public String name;
}
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		// コレクションへ格納しているのはあくまでもアドレスなので後から変更を加えると反映されてしまう
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}
}
