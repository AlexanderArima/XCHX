package set;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap.Fun01();
	}
	
	public static void Fun01() {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "黎明");
		map.put("2", "张三");
		map.put("3", "王五");
		map.put("1", "赵六");
		map.put("2", "何七");
		System.out.println(map);
		System.out.println(map.size());
		boolean flag1 = map.containsKey("1");
		System.out.println(String.format("是否包含键为1的字典：%s",(flag1 == true ? "包含": "不包含")));
		boolean flag2 = map.containsValue("刘四");
		System.out.println(String.format("是否包含值为刘四的字典：%s",(flag2 == true ? "包含": "不包含")));
		map.put("3", "刘四");
		boolean flag3 = map.containsValue("刘四");
		System.out.println(String.format("是否包含值为刘四的字典：%s",(flag3 == true ? "包含": "不包含")));
	}
}
