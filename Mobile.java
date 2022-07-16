package mobile;

public class Mobile {
	private String name;
	private String model;
	private String ram;
	private double price;
	private String color;
	private Sim sim;
	public void mob()
	{
		System.out.println(name);
		System.out.println(model);
		System.out.println(ram);
		System.out.println(price);
		System.out.println(color);
		System.out.println("-----------------------");
		sim.s();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
}
