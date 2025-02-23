


public class Main {
	
	public static void main(String [] args) {
		
		Burger basicBurger = new Burger.BurgerBuilder("seasme","Chicken").build();
		
		System.out.println(basicBurger);
		
		//create a fully loaded burger
		
		Burger loadedBurger  = new Burger. BurgerBuilder ("wheat","alllo") .addCheese()
                .addlettuce()
                .addsauce()
                .build();
		
		System.out.println(loadedBurger);
	}
}
