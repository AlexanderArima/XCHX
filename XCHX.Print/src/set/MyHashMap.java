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
import java.util.Hashtable;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap.Fun02();
	}
	
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
	}
	
	public static void Fun02() {
		Hashtable<String, String> map = new Hashtable<String, String>();
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
	}
	
}
