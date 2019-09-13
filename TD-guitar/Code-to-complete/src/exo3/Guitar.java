package exo3;

public class Guitar {

	String serialNumber, model;
	Builder builder;
	Type type;
	Wood backWood, topWood;
	double price;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
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

	public String getModel() {
		return model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean equals(Guitar arg0) {
		boolean equals = false;
		if (arg0 instanceof Guitar) {
			Guitar guitar = (Guitar) arg0;
			equals = guitar.getBuilder().equals(this.getBuilder()) && guitar.getModel().toLowerCase().equals(this.getModel().toLowerCase())
					&& guitar.getType().equals(this.getType()) && guitar.getBackWood().equals(this.getBackWood())
					&& guitar.getTopWood().equals(this.getTopWood());
		}
		return equals;
	}

	public Object getGuitarSpec() {
		// TODO Auto-generated method stub
		return null;
	}
}
