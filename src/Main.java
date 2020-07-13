import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Mapインターフェースはキー(key)と値(value)の2つの情報をペアとして格納するデータ構造
		// 格納した値は、キーを指定して読み書きできる
		// 値の重複は許されるが、キーの重複は許されない
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		// putで格納できる
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		// getで取り出すことができる
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、"+ tokyo +"万人です");
		prefs.remove("京都府");
		// 値を削除したため表示しようとするとエラーが出る
		// int kyoto = prefs.get("京都府");
		// System.out.println("京都府の人口は、"+ kyoto +"万人です");
		// 再度putで格納することで上書きされる
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、"+ kumamoto +"万人です");

		// まずキー一覧を取得し繰り返す
		for(String key: prefs.keySet()) {
			// キーを指定して値を取得
			int value = prefs.get(key);
			System.out.println(key+ "の人口は、"+ value +"万人です");
		}
	}
}
