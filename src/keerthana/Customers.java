package keerthana;

public class Customers {

	public static void main(String[] args) {
		System.out.println("Customer1");
		Pc customer1 = new Pc("Intel");  // 1 require
		
		System.out.println("Customer2");
		Pc customer2 = new Pc("ulterawide monitor", "Samsung mouse");
		String details = customer2.cpuandram(16,"intel");
		System.out.println(details);
		
		System.out.println("Customer3");
		Pc customer3 = new Pc();
		customer3.setIntegrated("Integrated with mouse,cpu,ram,monitor");
		System.out.println(customer3.getIntegrated());



	}
}