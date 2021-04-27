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

import java.util.*;
import java.util.Map.Entry;

import sun.management.counter.Variability;

public class MyIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun03();
	}
	
	/**
	 * ʹ����һ�ַ�ʽ�����õ���������HashMap
	 */
	private static void Fun04() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "����");
		map.put("2", "��ѧ");
		Set<String>keySet =  map.keySet();
		System.out.println(keySet);
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String keyString = iterator.next();
			String valueString = map.get(keyString);
			System.out.println("Key��" + keyString + "��Value��" + valueString);
		}
	}
	
	/**
	 * ����������HashMap
	 */
	@SuppressWarnings("unchecked")
	private static void Fun03() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "����");
		map.put("2", "��ѧ");
		Set<Entry<String, String>> ss = map.entrySet();	// map.entrySet()������ȡ��map�и�����ֵ�Եļ���
		System.out.println(ss);
		Iterator<Entry<String, String>> iterator = ss.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> item = (Map.Entry<String, String>)iterator.next();
			System.out.println("key��" + item.getKey() + "��value��" + item.getValue());
		}
	}
	
	/**
	 * ����������Set
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
	 * ����������List
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
				 // ���µ���������Ӳ������ؼ���3��Ԫ��
				 list_new.add(item);
			 }
		}
		
		System.out.println(list_new);
	}

}
