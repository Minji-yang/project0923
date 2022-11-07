package project0923;
class Animal{
	
	String name;
	public void setName(String name) {
		this.name=name;}
	
}


public class Animal0902 {

	public static void main(String[] args) {
		
Animal cat=new Animal();
Animal dog=new Animal();
Animal horse=new Animal();

cat.setName("mew");
dog.setName("happy");
horse.setName("hing");

System.out.println(cat.name);
System.out.println(dog.name);
System.out.println(horse.name);




	}

}
