package project0923;
class Car{
	int year;
	String name;
	
	int getYear(){return year;}//
}

class Gcompany extends Car{
	int number;
	
	
	String state;
	String getLocal_number() {
		if(number>1000)
			{state="true";}
		else state="false";
		return state;
	}
	
}

class Hcompany extends Car{
	int price;
	int getNavigate() {
		return price-10000000;
	}
}


class Scompany extends Car{
	int cc;
	int getSpeed() { return cc-1300;
	
} }
	


public class Company0923 {

	public static void main(String[] args) {
		
		Gcompany g=new Gcompany();
		Hcompany h=new Hcompany();
		Scompany s=new Scompany();
		
		g.name="쏘렌토"; g.year=2020; g.number=1234;
		System.out.println("Car name : " + g.name + "Car number" + g.number);
		System.out.println("Car year : " + g.getYear() + "Car sold : " + g.getLocal_number());
		
		
		


	}

}
