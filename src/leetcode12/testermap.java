package leetcode12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

class keyval implements Comparable<keyval>
{
	private int key;
	private String value;
	
	
	
	public keyval(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public int compareTo(keyval o) {
		// TODO Auto-generated method stub
		return (this.value.compareTo(o.value) == 0) ? 0 :
	        (this.value.compareTo(o.value) < 0) ? -1 : 1;
	}
	@Override
	public String toString() {
		return "keyval [key=" + key + ", value=" + value + "]";
	}
	
	
	
	
}

public class testermap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(9, "nerf");
		hm.put(3, "bat");
		hm.put(7, "apple");
		
		System.out.println(hm);
		
		ArrayList<keyval> list=new ArrayList<keyval>();
		
		for(int i:hm.keySet())
		{
			list.add(new keyval(i,hm.get(i)));
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		LinkedHashMap<Integer, String> sortedusingvalues=new LinkedHashMap<Integer, String>();
		
		for(keyval item:list)
		{
			sortedusingvalues.put(item.getKey(),item.getValue());
		}
		
		System.out.println("hash map after sorting using values..");
		
		System.out.println(sortedusingvalues);
		
	}

}
