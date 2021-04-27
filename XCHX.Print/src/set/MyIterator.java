/*********************************************
* 文 件 名:MyIterator.cs
* 功能描述：集合类中使用迭代器Iterator遍历元素
* 创 建 人: AlexanderArima
* 日    期: 2021-4-25
* 修 改 人:
* 修改日期:
* 修改描述:
* 版    本: 1.0.0
 * *******************************************/
package set;

import java.util.*;
import java.util.Map.Entry;

import sun.management.counter.Variability;

public class MyIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun03();
	}
	
	/**
	 * 使用另一种方式，利用迭代器遍历HashMap
	 */
	private static void Fun04() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "语文");
		map.put("2", "数学");
		Set<String>keySet =  map.keySet();
		System.out.println(keySet);
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String keyString = iterator.next();
			String valueString = map.get(keyString);
			System.out.println("Key：" + keyString + "，Value：" + valueString);
		}
	}
	
	/**
	 * 迭代器遍历HashMap
	 */
	@SuppressWarnings("unchecked")
	private static void Fun03() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "语文");
		map.put("2", "数学");
		Set<Entry<String, String>> ss = map.entrySet();	// map.entrySet()方法获取了map中各个键值对的集合
		System.out.println(ss);
		Iterator<Entry<String, String>> iterator = ss.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> item = (Map.Entry<String, String>)iterator.next();
			System.out.println("key：" + item.getKey() + "，value：" + item.getValue());
		}
	}
	
	/**
	 * 迭代器遍历Set
	 */
	private static void Fun02() {
		Set<String> set = new HashSet<String>();
		for(int i = 0;i < 5;i++) {
			set.add("a" + i);
		}
		
		System.out.println(set);
		Set<String> set_new = new HashSet<String>();
		for(Iterator<String>iterator = set.iterator();iterator.hasNext(); ) {
			String item = iterator.next();
			if(item.contains("3") == false) {
				set_new.add(item);
			}
		}
		
		System.out.println(set_new);
	}
	
	/**
	 * 迭代器遍历List
	 */
	private static void Fun01() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list.add("a" + i);
		}
		
		System.out.println(list);
		ArrayList<String> list_new = new ArrayList<String>();
		for(Iterator<String> iter = list.iterator();iter.hasNext();) {
			 String item = iter.next();
			 if(item.contains("3") == false) {
				 // 往新的数组中添加不包含关键字3的元素
				 list_new.add(item);
			 }
		}
		
		System.out.println(list_new);
	}

}
