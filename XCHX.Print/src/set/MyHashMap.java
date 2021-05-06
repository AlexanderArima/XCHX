/*********************************************
* 文 件 名:MyHashMap.cs
* 功能描述：集合包中HashMap的测试类
* 创 建 人: AlexanderArima
* 日    期: 2021-4-22
* 修 改 人:
* 修改日期:
* 修改描述:
* 版    本: 1.0.0
 * *******************************************/
package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap.Fun04();
	}
	
	/***
	 * HashMap的常用方法Demo
	 */
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
	
		// HashMap允许key为null
		map.put(null, "1");
	}
	
	/**
	 * Hashtable的常用方法例子
	 */
	public static void Fun02() {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("1", "黎明");
		table.put("2", "张三");
		table.put("3", "王五");
		table.put("1", "赵六");
		table.put("2", "何七");
		System.out.println(table);
		System.out.println(table.size());
		boolean flag1 = table.containsKey("1");
		System.out.println(String.format("是否包含键为1的字典：%s",(flag1 == true ? "包含": "不包含")));
		boolean flag2 = table.containsValue("刘四");
		System.out.println(String.format("是否包含值为刘四的字典：%s",(flag2 == true ? "包含": "不包含")));
		table.put("3", "刘四");
		boolean flag3 = table.containsValue("刘四");
		System.out.println(String.format("是否包含值为刘四的字典：%s",(flag3 == true ? "包含": "不包含")));
		
		// HashTable不允许key为null，这里会抛出异常
		table.put(null, "1");
	}
	
	/**
	 * TreeMap的常用方法例子
	 */
	public static void Fun03() {
		TreeMap<String, String> map = new TreeMap<String, String>();
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
	
		// HashMap允许key为null
		// map.put(null, "1");
	}

	/**
	 * HashSet的常用方法的例子
	 */
	public static void Fun04() {
		Set<String> set = new HashSet<String>();
		set.add("ZhangSan");
		set.add("LiSi");
		set.add("WangWu");
		System.out.println(set);
		set.add("LiSi");	// 由于Set中的元素是不可重复的，所以不会打印两个LiSi
		System.out.println(set);
		set.add(null);
		System.out.println(set);
		set.add(null);		// null值也是一样的，不会重复
		System.out.println(set);
	}
}
