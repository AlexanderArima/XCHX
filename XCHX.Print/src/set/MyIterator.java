/*********************************************
* �� �� ��:MyIterator.cs
* ������������������ʹ�õ�����Iterator����Ԫ��
* �� �� ��: AlexanderArima
* ��    ��: 2021-4-25
* �� �� ��:
* �޸�����:
* �޸�����:
* ��    ��: 1.0.0
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
				 // ���µ���������Ӳ������ؼ���3��Ԫ��
				 list_new.add(item);
			 }
		}
		
		System.out.println(list_new);
	}

}
