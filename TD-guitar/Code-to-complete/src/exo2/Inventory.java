package exo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		Iterator<Guitar> i = guitars.iterator();
		Guitar guitarFound = null;
		while (Objects.isNull(guitarFound) && i.hasNext()) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				guitarFound = guitar;
			}
		}
		return guitarFound;
	}

	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> guitarsFound = new ArrayList<>();
		for (Guitar guitar : guitars) {
			boolean testBuilder, testType, testModel, testTop, testBack;
			testBuilder = !isFilter(searchGuitar.getBuilder()) || Objects.equals(guitar.getBuilder(), searchGuitar.getBuilder());
			testType = !isFilter(searchGuitar.getType()) || Objects.equals(guitar.getType(), searchGuitar.getType());
			testModel = !isFilter(searchGuitar.getModel()) || Objects.equals(guitar.getModel(), searchGuitar.getModel());
			testTop = !isFilter(searchGuitar.getTopWood()) || Objects.equals(guitar.getTopWood(), searchGuitar.getTopWood());
			testBack = !isFilter(searchGuitar.getBackWood()) || Objects.equals(guitar.getBackWood(), searchGuitar.getBackWood());
			
			if (testBuilder && testType && testModel && testTop && testBack) {
				guitars.add(guitar);
			}
		}
		return guitarsFound;
	}
	
	private boolean isFilter(Object value) {
		return Objects.nonNull(value) && !"".equals(value.toString());
	}
}
