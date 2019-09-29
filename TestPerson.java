
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		
		System.out.println(p1.toString());
		
		/**************************************************************************/
		
		Person p2 = new Person("B010282007007B", "James", "Bond", "01/02/82", 'M', 190.70, 85.4);
		
		System.out.println(p2.toString());
		
		System.out.println("The BMI is " + p2.calcBmi(p2.getHeight(), p2.getWeight()));
		
		
		/*Now James Bond Becomes Jay Kumar*/
		
		p2.setFirstName("Jay");
		p2.setLastName("Kumar");
		
		System.out.println(p2.toString());
		
		/*Jay Kumar Becomes overweight*/
		
		p2.setWeight(170.50);
		
		System.out.println(p2.toString());
		
		System.out.println("The BMI is " + p2.calcBmi(p2.getHeight(), p2.getWeight()));
		
		/*************************************************************************/
		
		
		
	
	}
	
}
