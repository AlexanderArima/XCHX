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

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sun.management.counter.Variability;

public class MyIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun01();
		
	}
	
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
