

public class CalJAVA {
	
	public int sum(int a, int b)
	{
		
		return a+b;
	}
	public int sub(int a, int b)
	{
		
		return a*b;
	}
	
	

	public static void main(String[] args) {
		CalJAVA cal=new CalJAVA();
		
		System.out.println(cal.sum(10, 10));
		System.out.println(cal.sub(10, 8));
		

	}

}