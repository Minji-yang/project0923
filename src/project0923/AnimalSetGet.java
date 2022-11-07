package project0923;


public class AnimalSetGet {
	
	String name;

	 public String getName() { return name; }
	 
	  public void setName(String name) { this.name = name; }
		
	public static void main(String[] args) {
		
		 
 AnimalSetGet cat=new AnimalSetGet();
 AnimalSetGet dog=new AnimalSetGet();
 
 
 
cat.setName("mew");
 dog.setName("happy");
 System.out.print(cat.name);
 System.out.println(cat.getName());
	}

}
