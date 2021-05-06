package set;

import java.util.*;

public class MyCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun01();
		
	}
	
	private static void Fun01() {
		List<String> list = new ArrayList<String>(); 
		for(int i = 0;i < 5;i++) {
			list.add("a" + i);
		}
		
		System.out.println("原始数组：" + list);
		Collections.shuffle(list);		// 随机排序
		System.out.println("随机排序：" + list);
		Collections.reverse(list);		// 反向排序
		System.out.println("反向排序：" + list);
		Collections.sort(list);  	// 排序
		System.out.println("排序：" + list);
		int index = Collections.binarySearch(list, "a2");
		System.out.println("a2元素的下标：" + index);
		Collections.fill(list, "Hello World");
		System.out.println(list);
	}
}
