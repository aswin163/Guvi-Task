package task10;

class Tea{ // Tea class (Parent Class)
	
	public String ing1; // Declaring instance variables for ingredients 
	public String ing2;
	public String ing3;
	public String ing4;
	public String basictea;
	
	public void prepareTea(String i1, String i2) { // Prepate tea class
		ing1 = i1;
		ing2 = i2;
		basictea = ing2+" "+ing3+" "+ing4;
		System.out.println("Basic tea is prepared by adding : " +basictea);
	}
	
	public void addMilk(String i3) { // method to add milk
		ing3 = i3;
		// This method adds milk to the tea
	}
	
	public void addSugar(String i4) { //method to add sugar
		ing4 = i4;
		// This method adds Sugar to the tea
	}
}

class BlackTea extends Tea{ // First sub/child class
	
	String blacktea;
	
	public void addSugar(String i4) { //method to add sugar
		ing4 = i4;
		
	}
	
	public void prepareTea(String i1, String i2) { // Same method with same arguments, Overriding with different values
		ing1 = i1;
		ing2 = i2;
		blacktea = ing1+" " +ing2+ " " + ing4;
		System.out.println("Black tea is prepared by adding : " +blacktea);
		
	}
}

class GreenTea extends Tea{ // Second sub/child class
	
	String greentea;
	
	public void addSugar(String i4) { //method to add sugar
		ing4 = i4;
		
	}
	
	public void prepareTea(String i1, String i2) { // Same method with same arguments, Overriding with different values
		ing1 = i1;
		ing2 = i2;
		greentea = ing1+ " " +ing2+ " " + ing4;
		System.out.println("Green Tea is prepared by adding : " +greentea);
	}
	
}

class HerbalTea extends Tea{ // Third sub class
	String herbaltea;
	
	public void addSugar(String i4) { //method to add sugar
		ing4 = i4;
		
	}
	
	public void addMilk(String i3) { //Method to add milk
		ing3 = i3; 
	}
	
	public void prepareTea(String i1, String i2) { // Same method with same arguments, Overriding with different values
		ing1 = i1;
		ing2 = i2;
		herbaltea = ing3+ " " +ing1+ " " +ing2+ " " +ing4;
		System.out.println("Herbal tea is prepared by adding : " +herbaltea);
	}
	
}

public class Question5 { // Class with main method

	public static void main(String[] args) {
		
		Tea obj = new Tea(); // Parent class object
		obj.addMilk("Milk");
		obj.addSugar("Sugar");
		obj.prepareTea("HotWater", "TeaLeaves"); // Parent class method
		BlackTea obj1 = new BlackTea(); // first sub class object
		obj1.addSugar("Sugar");
		obj1.prepareTea("HotWater", "TeaLeaves" ); 
		GreenTea obj2 = new GreenTea(); // Second sub class object
		obj2.addSugar("Sugar");
		obj2.prepareTea("HotWater", "GreenTeaLeaves");
		HerbalTea obj3 = new HerbalTea(); //third sub class object
		obj3.addMilk("Milk");
		obj3.addSugar("Sugar");
		obj3.prepareTea("TeaPowder", "Ginger");		

	}

}
