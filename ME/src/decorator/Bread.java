package decorator;

public abstract class Bread {
	protected String description;
  
	public String getDescription() {
		return this.description;
	}
 
	public abstract double cost();
}
