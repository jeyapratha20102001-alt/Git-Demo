package javapractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class MapConcept {

	public static void main(String[] args) {
		// Hash Map Add Key Values

		/*
		 * HashMap<Integer, String> map = new HashMap<>();
		 * 
		 * 
		 * map.put(101, "Jeya"); map.put(102, "Pratha"); map.put(103, "Automation");
		 * map.put(101, "Rathi"); map.put(106, "Automation");
		 * 
		 * String put = map.put(102, "Moorthi"); String remove = map.remove(102);
		 * 
		 * boolean containsKey = map.containsKey(103); boolean containsValue =
		 * map.containsValue("Pratha"); String string = map.get(101); Set<Integer>
		 * keySet = map.keySet(); Collection<String> values = map.values();
		 * Set<Entry<Integer, String>> entrySet = map.entrySet();
		 * 
		 * System.out.println(entrySet); System.out.println(put);
		 */

		/*
		 * // Iterate Map using entrySet() Set<Map.Entry<Integer, String>> entry=
		 * map.entrySet(); for(Entry<Integer, String> e:entry) {
		 * System.out.println(e.getKey()+" "+e.getValue()); }
		 */

		// Count character Frequency using HashMap

		/*
		 * String str = "I love Automation"; LinkedHashMap<Character, Integer> map = new
		 * LinkedHashMap<>(); for (char c : str.toCharArray()) { if (c == ' ') continue;
		 * if (map.containsKey(c)) { map.put(c, map.get(c) + 1); } else { map.put(c, 1);
		 * }
		 * 
		 * } System.out.println(map);
		 */

		// Find Duplicate Characters Only using map
		/*
		 * String str = "automation"; char[] ch = str.toCharArray(); HashMap<Character,
		 * Integer> map = new HashMap<>(); for (char c : ch) { if (map.containsKey(c)) {
		 * map.put(c, map.get(c) + 1); } else { map.put(c, 1); } } for
		 * (Map.Entry<Character, Integer> entry: map.entrySet()) { if
		 * (entry.getValue()>1) { System.out.println(entry.getKey()); } }
		 */

		// Find first Duplicate Character in map

		/*
		 * String str="automation"; char[] ch=str.toCharArray();
		 * LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		 * 
		 * for (char c : ch) { if (map.containsKey(c)) { map.put(c, map.get(c)+1); }
		 * else { map.put(c, 1); } }
		 * 
		 * for(Map.Entry<Character, Integer> e:map.entrySet()) { if(e.getValue()>1) {
		 * System.out.println(e.getKey()); break; } }
		 */
		// Find first Non repeating Character

		/*
		 * String str="automationt"; char[] ch=str.toCharArray();
		 * 
		 * LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		 * 
		 * for(char c:ch) { if(map.containsKey(c)) { map.put(c, map.get(c)+1); } else {
		 * map.put(c, 1); } } System.out.println(map); for(Map.Entry<Character, Integer>
		 * e:map.entrySet()) { if (e.getValue()==1) { System.out.println(e.getKey());
		 * break; } }
		 */
		// Count Word Frequency in a sentence Using Map

		/*
		 * String str1="java is easy Java is fun"; String[] st
		 * =str1.toLowerCase().split(" "); LinkedHashMap<String,Integer> map=new
		 * LinkedHashMap<>(); for(String s:st) {
		 * 
		 * if(map.containsKey(s)) { map.put(s, map.get(s)+1); } else { map.put(s, 1); }
		 * } }
		 */
		// Using getOrDefault

		/*
		 * String str="Java is easy Java is fun"; String[] st =
		 * str.toLowerCase().split(" ");
		 * 
		 * LinkedHashMap<String,Integer> map=new LinkedHashMap<>(); for(String s:st) {
		 * map.put(s,map.getOrDefault(s, 0)+1); } System.out.println(map);
		 */

		// Remove Duplicate Characters

		/*
		 * String str="automation"; LinkedHashMap<Character,Integer> map=new
		 * LinkedHashMap<>();
		 * 
		 * for(char c:str.toCharArray()) { if(!map.containsKey(c)) { map.put(c, 1); } }
		 * for(char c:map.keySet()) { System.out.println(c); }
		 */

		// remove Duplicate Character
		/*
		 * String str="Java is easy Java is fun"; String[] s = str.split(" ");
		 * LinkedHashMap<String,Integer> map=new LinkedHashMap<>(); for(String s1:s) {
		 * if(!map.containsKey(s1)) { map.put(s1, 1); } } for(String s2:map.keySet()) {
		 * System.out.println(s2);
		 * 
		 * }
		 */
		/* Sort Map based on Values */
		/*
		 * HashMap<String,Integer> map=new HashMap<>(); map.put("java", 5);
		 * map.put("selenium", 2); map.put("testng", 8); map.put("maven", 1);
		 */
		/* Convert to List */
		/*
		 * ArrayList<Map.Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
		 * 
		 * Sort it
		 * 
		 * list.sort(Map.Entry.comparingByValue());
		 * 
		 * System.out.println(list);
		 * 
		 * // Convert to LinkedHashMap
		 * 
		 * LinkedHashMap<String,Integer> sortedmap=new LinkedHashMap<>();
		 * 
		 * for (Entry<String, Integer> entry : list) { sortedmap.put(entry.getKey(),
		 * entry.getValue());
		 * 
		 * } System.out.println(sortedmap);
		 * 
		 */

		// Sort Based On Keys ascending

		/*
		 * HashMap<Integer, String> map = new HashMap<>();
		 * 
		 * map.put(37, "java"); map.put(21, "python"); map.put(42, "c");
		 * 
		 * TreeMap<Integer, String> treemap = new TreeMap<>(map);
		 * 
		 * 
		 * for (int i : map.keySet()) { treemap.put(i, map.get(i)); }
		 * 
		 * System.out.println(treemap);
		 */

		// Sort Descending based on Key

		/*
		 * HashMap<Integer,String> map=new HashMap<>();
		 * 
		 * map.put(37, "java"); map.put(21, "python"); map.put(42, "c");
		 * 
		 * ArrayList<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
		 * 
		 * list.sort(Map.Entry.<Integer,String>comparingByKey().reversed());
		 * 
		 * 
		 * 
		 * LinkedHashMap<Integer,String> sortedmap = new LinkedHashMap<>();
		 * 
		 * for(Map.Entry<Integer, String> e: list) { sortedmap.put(e.getKey(),
		 * e.getValue()); }
		 * 
		 * System.out.println(sortedmap);
		 */

		// Anagram Using HashMap

		/*
		 * String s1 = "listen"; String s2 = "silant";
		 * 
		 * if (s1.length() != s2.length()) { System.out.println("Not Anagram"); return;
		 * }
		 * 
		 * Map<Character, Integer> map = new HashMap<>();
		 * 
		 * // Count characters from first string for (char ch : s1.toCharArray()) {
		 * map.put(ch, map.getOrDefault(ch, 0) + 1); }
		 * 
		 * // Decrease count using second string for (char ch : s2.toCharArray()) {
		 * map.put(ch, map.getOrDefault(ch, 0) - 1); }
		 * 
		 * for (int value : map.values()) { if (value != 0) {
		 * System.out.println("This is not anagram"); return; } }
		 * System.out.println("This is Anagram");
		 */

		// Count Number of Occurrences of Each Element in Array

		/*
		 * int[] a = { 10, 20, 13, 20, 10, 43 };
		 * 
		 * LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		 * 
		 * for (int i : a) { map.put(i, map.getOrDefault(i, 0) + 1); }
		 * System.out.println(map);
		 * 
		 * for (int k : map.keySet()) { if (map.get(k) > 1) { System.out.println(k);
		 * 
		 * } }
		 */
		
		
		
	}
}
