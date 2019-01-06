package tanerus.designpattern.structural.composite.realdemo;

import java.util.ArrayList;
import java.util.List;

//Component
public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();

	// It can be deleted
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	// It can be deleted
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public abstract String toString();

	String print(MenuComponent menuComponenet) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": " + url + "\n");
		return builder.toString();
	}

}
