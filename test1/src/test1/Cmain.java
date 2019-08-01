package test1;

public class Cmain extends Exp1 implements  Exp4,Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exp1 ob = new Cmain();
		
		ob.add(7,9);

	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		Exp4.super.sum(a, b);
	}

	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	

}
