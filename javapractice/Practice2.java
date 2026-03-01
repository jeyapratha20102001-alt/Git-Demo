package javapractice;

public class Practice2 {
	
	public String stdName;
	public int marks;
	
	/*
	 * Practice2(String s,int m){ stdName=s; marks=m;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		/* Practice2 obj=new Practice2("Jeya",97); */
		
		Practice2 obj=new Practice2();
		obj.display();
		
		System.out.println(obj.addTwoNumbers(6, 9));

	}
	
	public void display() {
		System.out.println(stdName+marks);
	}
	
	
	public int addTwoNumbers(int a,int b) {
		return a+b;
		
		
	}
	
	
	
	

}
