package Java;

public class bharath1 extends bharath{

	@Override
	public void method1() {
		
		super.method2();
		//this.method1();
		System.out.println("This is not an abstract method");
		
	}

	public void method2(){
		System.out.println("This is not an abstract method");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bharath1 b = new bharath1();
		b.method1();
		b.method2();
	}



	

}
