
public class Burger {

	private String bun;
	private String patty;
	private boolean cheese;
	private boolean lettuce;
	private boolean sauce;
	
	private Burger(BurgerBuilder builder) {
		this.bun = builder.bun;
		this.patty = builder.patty;
		this.cheese = builder.cheese;
		this.lettuce = builder.lettuce;
		this.sauce = builder.sauce;
	}
		@Override
		public String toString() {
			return "Burger With" + bun + "bun" + patty + "patty" + (cheese ? "cheese, " : "") +
		               (lettuce ? "lettuce, " : "") +
		               (sauce ? "sauce" : "");
		}
		public static class BurgerBuilder {
				
			private String bun;
			private String patty;
			private boolean cheese;
			private boolean lettuce;
			private boolean sauce;
			
			//required fields 
			public BurgerBuilder(String bun,String patty) {
				this.bun = bun;
				this.patty = patty;
			}
			// non required fields 
			// method chaining 
			
			public BurgerBuilder addCheese() {
				this.cheese = true;
				return this;
			}
			
			public BurgerBuilder addlettuce() {
				this.lettuce = true;
				return this;
			}
			
			public BurgerBuilder addsauce() {
				this.sauce = true;
				return this;
			}
			
			public Burger build() {
	            return new Burger(this);
	        }
		}	
	}
