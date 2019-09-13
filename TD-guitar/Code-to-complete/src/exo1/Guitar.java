package exo1;

public class Guitar {

	String serialNumber, builder, model, type, backWood, topWood;
	double price;

	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		super();
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getBackWood() {
		return backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public boolean equals(Guitar arg0) {
		boolean equals = false;
		if (arg0 instanceof Guitar) {
			Guitar guitar = (Guitar) arg0;
			equals = guitar.getBuilder().equals(this.getBuilder()) && guitar.getModel().equals(this.getModel())
					&& guitar.getType().equals(this.getType()) && guitar.getBackWood().equals(this.getBackWood())
					&& guitar.getTopWood().equals(this.getTopWood());
		}
		return equals;
	}
}
