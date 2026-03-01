package javapractice;

public class StringReversePrepare {

	public static void main(String[] args) {
		/*
		 * // Reverse String for Loop String a = "Java"; String rev = ""; for (int i =
		 * a.length() - 1; i >= 0; i--) { rev = rev + a.charAt(i); }
		 * System.out.println(rev);
		 * 
		 * // while loop String a1 = "while java"; int start = a1.length() - 1; String
		 * rev1 = ""; int end = 0; while (start >= end) { rev1 = rev1 +
		 * a1.charAt(start); start--;
		 * 
		 * } System.out.println(rev1);
		 * 
		 * // Reverse without using StringBuilder & without extra variable
		 * 
		 * String b="Jeya Pratha"; for (int i = b.length()-1; i >=0 ; i--) {
		 * System.out.print(b.charAt(i)); }
		 */

		// Reverse Words level
		// 1.

		/*
		 * String str="I love Testing"; String[] splitted = str.split("\\s+"); for (int
		 * i = splitted.length-1; i >=0 ; i--) { System.out.print(splitted[i]+" "); }
		 * 
		 * // Using while loop
		 * 
		 * String str1="I  love   Java"; String[] splitted2 = str1.split("\\s+"); String
		 * revise=""; int start=splitted2.length-1; while(start>=0) {
		 * revise=revise+splitted2[start]+" "; start--; }
		 * System.out.print(revise.trim());
		 */

		// Reverse each word
		/*
		 * String str="I Love Testing"; String[] split1 = str.split(" "); String
		 * result=""; for(String s:split1) {
		 * 
		 * for (int i = s.length()-1; i >=0 ; i--) { result=result+s.charAt(i); }
		 * result=result+" "; } System.out.println(result);
		 */

		// for loop only
		/*
		 * String str="I love Automation"; String[] split2 = str.split(" "); String
		 * result=""; for (int i = 0; i < split2.length; i++) { String resd="";
		 * resd=resd+split2[i]; // System.out.println(resd); for (int j =
		 * resd.length()-1; j >=0 ; j--) { result=result+resd.charAt(j); }
		 * result=result+" "; } System.out.println(result);
		 */

		// Without inBulit methods (without split) Reverse words in string

		/*
		 * String str="I love Automation"; String word=""; String result="";
		 * 
		 * for (int i = 0; i < str.length(); i++) { if (str.charAt(i)!=' ') {
		 * word=word+str.charAt(i); } else { result=word+" "+result; word=""; } }
		 * 
		 * result=word+" "+result; System.out.println(result);
		 */

		// Reverse each word without split
		/*
		 * String str="I love Automation"; String word=""; String result=""; String[]
		 * ss=new String[str.length()];
		 * 
		 * for (int i = 0; i < str.length(); i++) { if (str.charAt(i)!=' ') {
		 * word=str.charAt(i)+word; } else { result=result+" "+word; word=""; } }
		 * 
		 * result=result+" "+word; System.out.println(result);
		 * 
		 * // Using split each word using split String rev="I love automate"; String[]
		 * split2 = rev.split(" "); String res=""; for (String string : split2) {
		 * 
		 * for (int i = string.length()-1; i >=0 ; i--) { res=res+string.charAt(i); }
		 * res=res+" "; }
		 * 
		 * System.out.println(res);
		 */

		// Reverse Only Vowels

		/*
		 * String str1 = "Programming is awesome";
		 * 
		 * String revvow = ""; String result = ""; for (int i = 0; i < str1.length();
		 * i++) { char ch = Character.toLowerCase(str1.charAt(i)); if (ch == 'a' || ch
		 * == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { revvow = ch + revvow;
		 * 
		 * }
		 * 
		 * } int index = 0; for (int i = 0; i < str1.length(); i++) { char ch1 =
		 * Character.toLowerCase(str1.charAt(i)); if (ch1 == 'a' || ch1 == 'e' || ch1 ==
		 * 'i' || ch1 == 'o' || ch1 == 'u') { result = result + revvow.charAt(index);
		 * index++; } else { result = result + ch1; } }
		 * 
		 * System.out.println(result);
		 */
		// Reverse only constants
		/*
		 * String str1 = "hello"; String revvow="";String result=""; for (int i = 0; i <
		 * str1 .length(); i++) { char ch=Character.toLowerCase(str1.charAt(i)); if
		 * (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') { revvow=ch+revvow;
		 * 
		 * }
		 * 
		 * } int index=0; for (int i = 0; i < str1.length(); i++) { char
		 * ch1=Character.toLowerCase(str1.charAt(i)); if
		 * (ch1!='a'&&ch1!='e'&&ch1!='i'&&ch1!='o'&&ch1!='u') {
		 * result=result+revvow.charAt(index); index++; } else { result=result+ch1; } }
		 * 
		 * System.out.println(result);
		 */

		// Reverse Only alphabets
		/*
		 * String str1 = "a@b$c"; String revvow="";String result=""; for (int i = 0; i <
		 * str1 .length(); i++) { char ch=Character.toLowerCase(str1.charAt(i)); boolean
		 * al=Character.isLetter(ch); if (al==true) { revvow=ch+revvow;
		 * 
		 * }
		 * 
		 * } int index=0; for (int i = 0; i < str1.length(); i++) { char
		 * ch1=Character.toLowerCase(str1.charAt(i)); boolean
		 * al=Character.isLetter(ch1); if (al==true) {
		 * result=result+revvow.charAt(index); index++; } else { result=result+ch1; } }
		 * 
		 * System.out.println(result);
		 */

		// Reverse first half String

		/*
		 * String str = "abcdef"; String rev = ""; String result = ""; for (int i = 0; i
		 * < str.length() / 2; i++) { rev = str.charAt(i) + rev; } int index = 0; for
		 * (int i = 0; i < str.length(); i++) { if (i < str.length() / 2) { result =
		 * result + rev.charAt(index); index++; } else { result = result +
		 * str.charAt(i); } } System.out.println(result);
		 */

		// Reverse Second half String

		/*
		 * String str = "abcdefg"; String rev = ""; String result = ""; for (int i =
		 * str.length() - 1; i >= (str.length()+1 )/ 2; i--) { rev = rev +
		 * str.charAt(i);
		 * 
		 * } int index = 0; for (int i = 0; i < str.length(); i++) { if (i >=
		 * (str.length()+1)/ 2) { result = result + rev.charAt(index); index++; } else {
		 * result = result + str.charAt(i); }
		 * 
		 * }
		 * 
		 * System.out.println(result);
		 */

		/*
		 * String sub="abcdef"; int mid=sub.length()/2; String result=""; String rev="";
		 * for (int i = sub.length()-1; i >= mid; i--) { rev=rev+sub.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 */
		// Reverse Substring
		/*
		 * String str="automation"; int start=3; int end=7; String rev=""; String
		 * result=""; String substring = str.substring(start,end); for (int i = start; i
		 * < end; i++) { rev=str.charAt(i)+rev; } for (int i = 0; i < str.length(); i++)
		 * { if (i<=start&&i<end) { result=result+rev.charAt(start); start++; } else {
		 * result=result+str.charAt(start);
		 * 
		 * } } System.out.println(result);
		 */

		/*
		 * String str = "amma"; String rev = ""; for (int i = str.length() - 1; i >= 0;
		 * i--) { rev = rev + str.charAt(i); } if (str.equals(rev)) {
		 * System.out.println("Given String is Palindrome"); } else {
		 * System.out.println("Given String is Not Palindrome"); }
		 */
		//  Check Palindrome Without using reverse
		/*
		 * String str = "mwmhwm"; boolean ispalindrome = true;
		 * 
		 * for (int i = 0; i < str.length()/2; i++) {
		 * 
		 * if (str.charAt(i) != str.charAt(str.length()-1-i)) { ispalindrome = false;
		 * break; } }
		 * 
		 * if (ispalindrome) { System.out.println("Palindrome"); } else {
		 * System.out.println("Given Not Palindrome"); }
		 */


		
		
		
		
		// Without using split

		/*
		 * String str="I love Automate"; String result="";String word=""; for (int i =
		 * 0; i < str.length(); i++) { if (str.charAt(i)!=' ') {
		 * word=str.charAt(i)+word; } else { result=result+" "+word; word=""; } }
		 * result=result+" "+word; System.out.println(result);
		 */
		// Using Split
		/*
		 * String str="I love Automate";String result=""; String[] split =
		 * str.split(" ");
		 * 
		 * for (String string : split) { String revise=""; for (int i =
		 * string.length()-1; i >=0 ; i--) { revise=revise+string.charAt(i); }
		 * result=result+" "+revise; }
		 * 
		 * System.out.println(result);
		 */

		// Count Palindrome words in Sentence
		/*
		 * String str="amma love malayalam"; String result=""; String[] split1 =
		 * str.split(" "); int palincnt=0; for (String string : split1) { String
		 * revise=""; for (int i = string.length()-1; i >=0 ; i--) {
		 * revise=revise+string.charAt(i);
		 * 
		 * } result=result+" "+revise; result=result.trim(); } String[] revsplit =
		 * result.split(" "); for (int i = 0; i < split1.length; i++) { if
		 * (split1[i].equals(revsplit[i])) { palincnt++; }
		 * 
		 * }
		 * 
		 * System.out.println(palincnt);
		 * 
		 * 
		 * 
		 */

		// Count Plaindrome Words in a sreing

		/*
		 * String str = "amma love malayalam madam"; String[] split = str.split(" ");
		 * int palincnt = 0; for (String string : split) { boolean ispalindrome = true;
		 * ; for (int i = 0; i < string.length() / 2; i++) { if (string.charAt(i) !=
		 * string.charAt(string.length() - 1 - i)) { ispalindrome = false; } } if
		 * (ispalindrome) { palincnt++; } }
		 * 
		 * System.out.println(palincnt);
		 */
		/*
		 * // Boolean concept String str="amma"; boolean isplaindrome=false;;
		 * 
		 * if(isplaindrome) { System.out.println("this is  palindrome"); } else {
		 * System.out.println("this is not  palindrome"); }
		 */

		/*
		 * String str="i love automation "; String rev=""; int start=str.length()-1; int
		 * end=0; while(start>=end) { rev=rev+str.charAt(start); start--; }
		 * System.out.println(rev);
		 */
  // reverse each word simple with Split
	/*
	 * String str="I love Automation"; String[] split = str.split(" "); String
	 * result=""; for (String string : split) { for (int i = string .length()-1; i
	 * >=0 ; i--) { result=result+string.charAt(i); } result=result+" "; }
	 * 
	 * System.out.println(result);
	 */
		
		// reverse String without Split
		String str="I love Automation"; 
		 String result="";String word="";
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)!=' ') {
				
				word=str.charAt(i)+word;
			}
			else {
				result=result+" "+word;
				word="";
				
				}
			
		}
		result=result+" "+word;
		System.out.println(result.trim());
	}
}