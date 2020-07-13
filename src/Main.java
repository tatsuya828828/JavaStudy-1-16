import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import job.Hero;

public class Main {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		Hero h = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		heros.add(h);
		heros.add(h2);

		for(Hero hero: heros) {
			System.out.println(hero.getName());
		}

		Map<String, Integer> heros2 = new HashMap<>();
		heros2.put(h.getName(), 3);
		heros2.put(h2.getName(), 7);

		for(String key: heros2.keySet()) {
			int value = heros2.get(key);
			System.out.println(key +"が倒した数"+ value +"体");
		}
	}
}
