package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionQuestion {
	public static void main(String[] args) {

		// Count Frequency of character in String using map

		String str = "I love Automation";
		char[] st1 = str.toLowerCase().toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : st1) {
			if (c == ' ')
				continue;
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		// Count Frequency of Words in a Sentence using map

		/*
		 * String str="Java is easy, is Java is easy"; String[] split
		 * =str.toLowerCase().replaceAll("[^a-z ]","").split(" ");
		 * 
		 * LinkedHashMap<String,Integer> map=new LinkedHashMap<>(); ] for(String
		 * s:split) { map.put(s, map.getOrDefault(s, 0)+1);
		 * 
		 * } System.out.println(map);
		 */

		// Find First Non Repeating Character

		/*
		 * String s="aabbcddeec";
		 * 
		 * LinkedHashMap<Character,Integer> map=new LinkedHashMap<>(); for(char
		 * c:s.toCharArray()) { map.put(c, map.getOrDefault(c, 0)+1); }
		 * 
		 * 
		 * for(char c:map.keySet()) { if(map.get(c)==1) { System.out.println(c); return;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("No Non Repatinfg Characters ");
		 */

		// Remove Duplicates from List

		/*
		 * Integer[] a1 = { 10, 20, 30, 10, 40, 20 };
		 * 
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * for (int i : a1) { list.add(i); }
		 * 
		 * LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		 * 
		 * for (int j : list) { set.add(j); } System.out.println(set);
		 * 
		 * 
		 */

		// Check 2 string anagram
		/*
		 * String str="silent"; String str2="lisaen";
		 * 
		 * if(str.length()!=str2.length()) { System.out.println("This is not anagram");
		 * }
		 * 
		 * HashMap<Character,Integer> map=new HashMap<>();
		 * 
		 * for(char c:str.toCharArray()) { map.put(c, map.getOrDefault(c, 0)+1); }
		 * for(char c1:str2.toCharArray()) { map.put(c1, map.getOrDefault(c1,0)-1);
		 * 
		 * } for(int v:map.values()) { if(v!=0) {
		 * System.out.println("This  is not anagram"); return; }
		 * 
		 * }/
		 * 
		 * System.out.println("This is anagram");
		 */

		// Sort Map based on Values

		/*
		 * HashMap<Integer, String> map = new HashMap<>();
		 * 
		 * map.put(1, "bana"); map.put(2, "apple"); map.put(13, "mango"); map.put(4,
		 * "orange");
		 * 
		 * List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		 * 
		 * list.sort(Map.Entry.<Integer,String>comparingByValue().reversed());
		 * 
		 * LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		 * 
		 * for (Map.Entry<Integer, String> e : list) { map1.put(e.getKey(),
		 * e.getValue()); }
		 * 
		 * System.out.println(map1);
		 */
		/*
		 * HashMap<Integer, String> map = new HashMap<>();
		 * 
		 * map.put(51, "bana"); map.put(2, "apple"); map.put(13, "mango"); map.put(24,
		 * "orange");
		 * 
		 * TreeMap<Integer,String> treemap=new TreeMap<>(); for(int i:map.keySet()) {
		 * treemap.put(i, map.get(i)); } System.out.println(treemap);
		 */

		// Find Duplicate Elements
		/*
		 * int[] arr= {1,2,3,2,5,1,5};
		 * 
		 * LinkedHashSet<Integer> set=new LinkedHashSet<>(); LinkedHashSet<Integer>
		 * duplicates=new LinkedHashSet<>();
		 * 
		 * for(int j:arr) { if(!set.add(j)) { duplicates.add(j);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(duplicates);
		 */

		// Duplicate Charcters
		/*
		 * String str="i love automation";
		 * 
		 * LinkedHashSet<Character> set=new LinkedHashSet<>(); LinkedHashSet<Character>
		 * dupset=new LinkedHashSet<>();
		 * 
		 * for(char c:str.toCharArray()) { if(c==' ') continue; if(!set.add(c)) {
		 * dupset.add(c); } } System.out.println(dupset);
		 */
		// Find 2nd largest Number in list using Iterator

		/*
		 * Integer[] arr = { 32, 45, 16, 48, 85 };
		 * 
		 * List<Integer> list = Arrays.asList(arr); list.sort(null);
		 * 
		 * System.out.println(list.get(list.size()-2));
		 */
		/*
		 * int max1 = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE; for (int i = 0; i
		 * < list.size(); i++) { if (max1 < list.get(i)) { max2 = max1; max1 =
		 * list.get(i); } else if (max2 < list.get(i) && list.get(i) != max1) { max2 =
		 * list.get(i); } } System.out.println(max2);
		 */
		// Find Common Elements
		/*
		 * Integer[] arr = { 32, 45, 16, 48, 85 }; Integer[] arr1= { 12, 55, 45, 82, 16
		 * };
		 * 
		 * List<Integer> list=Arrays.asList(arr); List<Integer>
		 * list2=Arrays.asList(arr1);
		 * 
		 * boolean retainAll = list.retainAll(list2); System.out.println(retainAll);
		 */

		// Find Highest Frequency Character
		/*
		 * String str="aabb"; int maxcount=0;char maxchar=' ';
		 * HashMap<Character,Integer> map=new HashMap<>();
		 * 
		 * for(char c:str.toCharArray()){ map.put(c,map.getOrDefault(c, 0)+1); }
		 * System.out.println(map);
		 * 
		 * for(Map.Entry<Character, Integer> e:map.entrySet()) {
		 * if(e.getValue()>maxcount) { maxcount=e.getKey(); maxchar=e.getKey(); }
		 * 
		 * }
		 * 
		 * System.out.println(maxchar);
		 */

		// Count Frequency of each Character

		/*
		 * String str="automation";
		 * 
		 * LinkedHashMap<Character,Integer> map=new LinkedHashMap<>(); for(char
		 * c:str.toCharArray()) { map.put(c, map.getOrDefault(c, 0)+1);
		 * 
		 * } System.out.println(map);
		 */

		// Remove Duplicates from Array using Set

		/*
		 * int[] arr= {1,2,3,2,4,1,5};
		 * 
		 * HashSet<Integer> set=new LinkedHashSet<>();
		 * 
		 * for(int i:arr) { set.add(i); }
		 */

		/* System.out.println(set); */

		// Remove Characters from a String

		/*
		 * String str = "automation";
		 * 
		 * LinkedHashSet<Character> set = new LinkedHashSet<>();
		 * 
		 * for (char c : str.toCharArray()) { set.add(c);
		 * 
		 * }
		 * 
		 * System.out.println(set);
		 */

		// Find Frequency of Words in a Sentence
		/*
		 * String str = "selenium java selenium testng java"; String[] s =
		 * str.split(" ");
		 * 
		 * LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		 * 
		 * for(String s1:s) { map.put(s1, map.getOrDefault(s1, 0)+1); }
		 * 
		 * System.out.println(map);
		 */
		// find Duplicate elements in an aray
		/*
		 * int[] arr = {1,2,3,4,2,5,3,6}; LinkedHashSet<Integer> set=new
		 * LinkedHashSet<>(); LinkedHashSet<Integer> dupset=new LinkedHashSet<>();
		 * 
		 * for(int a:arr) { if(!set.add(a)) { dupset.add(a); } }
		 * System.out.println(dupset);
		 */
		List<Integer> list = Arrays.asList(10, 20, 5, 30, 25);

		Collections.sort(list);

		System.out.println(list.get(list.size() - 2));

	}

}