/*Create a class MathOperation with two data member X and Y to store the operand and third data member R to store 
 	result of operation.
	Create method members
init - to input X and Y from useradd - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
*/
public class Calculator {
	private int X=40;
	private int Y=20;
	private int Addition;
	private int Substraction;
	private int Multiplication;
	private int Division;
	
	
	
	public void add()
	{
		Addition=X+Y;
		
			System.out.println("Addition="+Addition);
		
	 }
	public void Sub()
	{
		Substraction=X-Y;
		
			System.out.println("Substraction="+Substraction);
		
	 }
	
	public  void multiply()
	{
		Multiplication=X*Y;
		System.out.println("Multiplication="+Multiplication);
	}
	public  void Division()
	{
		Division=X/Y;
		System.out.println("Division="+Division);
	}
	
	
	
	public static void main(String[] args) {
		Calculator m=new Calculator();
		
		m.add();
		m.Sub();		
		m.multiply();
		m.Division();
		
		
		
	}

}
