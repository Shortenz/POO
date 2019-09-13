package exo3;

public class GuitarSpec {
	
	String model;
	Builder builder;
	Type type;
	Wood backWood, topWood;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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

}
