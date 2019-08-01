package test1;

public interface Exp3 {
	
	public void subtract (int a ,int b);
	public default void  sum ( int a, int b)
	{
		System.out.println(a+b) ;
		
	}
}


