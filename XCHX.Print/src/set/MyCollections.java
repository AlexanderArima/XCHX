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
		
		System.out.println("ԭʼ���飺" + list);
		Collections.shuffle(list);		// �������
		System.out.println("�������" + list);
		Collections.reverse(list);		// ��������
		System.out.println("��������" + list);
		Collections.sort(list);  	// ����
		System.out.println("����" + list);
		int index = Collections.binarySearch(list, "a2");
		System.out.println("a2Ԫ�ص��±꣺" + index);
		Collections.fill(list, "Hello World");
		System.out.println(list);
	}
}
