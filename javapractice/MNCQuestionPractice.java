package javapractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MNCQuestionPractice {

	public static void main(String[] args) {
		// Count Vowels
		/*
		 * String str="automation";int vowcnt=0; for (int i = 0; i < str.length(); i++)
		 * { char ch=str.charAt(i); boolean isvow=false; if
		 * (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') { isvow=true; } if(isvow) {
		 * vowcnt++; } }
		 * 
		 * 
		 * 
		 * System.out.println(vowcnt);
		 */

		// Frequency of each character

		/*
		 * String str = "i love automation"; String sl = str.toLowerCase(); String chd =
		 * "";
		 * 
		 * char[] arr = sl.toCharArray(); for (int i = 0; i < arr.length; i++) { int
		 * count = 1; if (arr[i] != 0&&arr[i]!=' ') {
		 * 
		 * for (int j = i + 1; j < arr.length; j++) { if (arr[i] == arr[j]) { count++;
		 * arr[j] = 0;
		 * 
		 * } } System.out.println("Frequency of each char:" + arr[i]+" "+ count ); }
		 * 
		 * if (count > 1) { System.out.println("duplicate character " + arr[i] + count);
		 * }
		 * 
		 * 
		 * }
		 */

		// ChatGpt
		/*
		 * String str = "i love automation"; str = str.toLowerCase();
		 * 
		 * char[] arr = str.toCharArray();
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * if (arr[i] == 0) continue;
		 * 
		 * int count = 1;
		 * 
		 * for (int j = i + 1; j < arr.length; j++) {
		 * 
		 * if (arr[i] == arr[j]) { count++; arr[j] = 0; } }
		 * 
		 * if (count > 1) { System.out.println("Duplicate character " + arr[i] + " = " +
		 * count); } }
		 */
		// Occurence //
		/*
		 * String str = "I love automation"; str = str.toLowerCase();
		 * 
		 * char[] ch = str.toCharArray();
		 * 
		 * for (int i = 0; i < ch.length; i++) { int count = 1; // Skip if already
		 * visited OR space if (ch[i] == 0 || ch[i] == ' ') continue;
		 * 
		 * 
		 * 
		 * for (int j = i + 1; j < ch.length; j++) {
		 * 
		 * if (ch[i] == ch[j]) { count++; ch[j] = 0; // mark as visited } }
		 * 
		 * System.out.println(ch[i] + " = " + count); }
		 */

		// Count vowels and consonants

		/*
		 * String str1="I love selenium"; String str = str1.toLowerCase(); int vowcnt=0;
		 * int concount=0; for (int i = 0; i < str.length(); i++) { char
		 * ch=str.charAt(i); if (ch>='a'&&ch<='z') { if
		 * (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') { vowcnt++; } else {
		 * concount++; } } }
		 * System.out.println("Vowels Count "+vowcnt+" "+" Consonant Count " +concount);
		 */

		// Count Consonant Count
		/*
		 * String str="i love automation"; int concount=0; for (int i = 0; i <
		 * str.length(); i++) { char ch=str.charAt(i); if (ch>='a'&&ch<='z') { if
		 * (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') { concount++; } }
		 * 
		 * } System.out.println("Consonant Count "+concount);
		 */

		// Find first non Repeater characters

		/*
		 * String str = "i love automation"; char[] ch = str.toCharArray(); for (int j =
		 * 0; j < ch.length; j++) { int count = 1;
		 * 
		 * if (ch[j] == 0 || ch[j] == ' ') continue;
		 * 
		 * for (int l = j + 1; l < ch.length; l++) { if (ch[j] == ch[l]) { count++;
		 * ch[l] = 0; } } if (count == 1) {
		 * System.out.println("First Non Repeated Characters:" + ch[j] + "=" + count);
		 * break; } }
		 */
				
			// Remove Duplicate Characters

		/* String str = "automation"; */
		/*
		 * char[] ch = str.toCharArray();
		 * 
		 * for (int i = 0; i < ch.length; i++) {
		 * 
		 * if (ch[i] == 0) continue;
		 * 
		 * for (int j = i + 1; j < ch.length; j++) {
		 * 
		 * if (ch[i] == ch[j]) { ch[j] = 0; } } }
		 * 
		 * for (int l = 0; l < ch.length; l++) { if (ch[l] != 0) {
		 * System.out.print(ch[l]); } }
		 */

		// Two Strings are Anagram

		/*
		 * String s1 = "silent"; String s2 = "listen";
		 * 
		 * if (s1.length() != s2.length()) { System.out.println("It is Not anagram"); }
		 * else { char[] ch1 = s1.toCharArray(); char[] ch2 = s2.toCharArray();
		 * 
		 * Arrays.sort(ch1); Arrays.sort(ch2);
		 * 
		 * if (Arrays.equals(ch1, ch2)) { System.out.println("This is Anagram"); } else
		 * { System.out.println("This is Not Anagram"); }
		 * 
		 * }
		 */
		
		// Find Duplicate Words in a Sentence 
		
		/*
		 * String str="Amma love Amma like Amma like"; String[] split = str.split(" ");
		 * 
		 * for (int i = 0; i < split.length; i++) { int count=1;
		 * 
		 * if (split[i].equals("Visited")) continue; for (int k = i+1; k < split.length;
		 * k++) { if (split[i].equals(split[k])) { count++; split[k]="Visited"; } } if
		 * (count>1) {
		 * System.out.println("Duplicate words in a Sentence"+split[i]+" ;"+count); } }
		 */
		
		// Longest SubString Without  Repeating Characters 
		// Pending 
		
		
		
		
		
		
		
	}

}
