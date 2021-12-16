public class Person{
	public String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}

	// Main Method
	public static void main (String [] args)
	{
		Person prsn = new Person();
		prsn.setName("Bob Smith");
		System.out.println (prsn.getName());
	}
}
