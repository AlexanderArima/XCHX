/*********************************************
* �� �� ��:MyHashMap.cs
* �������������ϰ���HashMap�Ĳ�����
* �� �� ��: AlexanderArima
* ��    ��: 2021-4-22
* �� �� ��:
* �޸�����:
* �޸�����:
* ��    ��: 1.0.0
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
	 * HashMap�ĳ��÷���Demo
	 */
	public static void Fun01() {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "����");
		map.put("2", "����");
		map.put("3", "����");
		map.put("1", "����");
		map.put("2", "����");
		System.out.println(map);
		System.out.println(map.size());
		boolean flag1 = map.containsKey("1");
		System.out.println(String.format("�Ƿ������Ϊ1���ֵ䣺%s",(flag1 == true ? "����": "������")));
		boolean flag2 = map.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag2 == true ? "����": "������")));
		map.put("3", "����");
		boolean flag3 = map.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag3 == true ? "����": "������")));
	
		// HashMap����keyΪnull
		map.put(null, "1");
	}
	
	/**
	 * Hashtable�ĳ��÷�������
	 */
	public static void Fun02() {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("1", "����");
		table.put("2", "����");
		table.put("3", "����");
		table.put("1", "����");
		table.put("2", "����");
		System.out.println(table);
		System.out.println(table.size());
		boolean flag1 = table.containsKey("1");
		System.out.println(String.format("�Ƿ������Ϊ1���ֵ䣺%s",(flag1 == true ? "����": "������")));
		boolean flag2 = table.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag2 == true ? "����": "������")));
		table.put("3", "����");
		boolean flag3 = table.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag3 == true ? "����": "������")));
		
		// HashTable������keyΪnull��������׳��쳣
		table.put(null, "1");
	}
	
	/**
	 * TreeMap�ĳ��÷�������
	 */
	public static void Fun03() {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("1", "����");
		map.put("2", "����");
		map.put("3", "����");
		map.put("1", "����");
		map.put("2", "����");
		
		System.out.println(map);
		System.out.println(map.size());
		boolean flag1 = map.containsKey("1");
		System.out.println(String.format("�Ƿ������Ϊ1���ֵ䣺%s",(flag1 == true ? "����": "������")));
		boolean flag2 = map.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag2 == true ? "����": "������")));
		map.put("3", "����");
		boolean flag3 = map.containsValue("����");
		System.out.println(String.format("�Ƿ����ֵΪ���ĵ��ֵ䣺%s",(flag3 == true ? "����": "������")));
	
		// HashMap����keyΪnull
		// map.put(null, "1");
	}

	/**
	 * HashSet�ĳ��÷���������
	 */
	public static void Fun04() {
		Set<String> set = new HashSet<String>();
		set.add("ZhangSan");
		set.add("LiSi");
		set.add("WangWu");
		System.out.println(set);
		set.add("LiSi");	// ����Set�е�Ԫ���ǲ����ظ��ģ����Բ����ӡ����LiSi
		System.out.println(set);
		set.add(null);
		System.out.println(set);
		set.add(null);		// nullֵҲ��һ���ģ������ظ�
		System.out.println(set);
	}
}
