package exo4;

public class GuitarSpec {
	    
	String model;
	Builder builder;
	Type type;
	Wood backWood, topWood;
	int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood,
			Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
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

	public int getNumStrings() {
		return numStrings;
	}

}
