package co.grandcircus;

public class Country {

	
	String name;
	int population;
	
	
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	public Country(String countryStuff, String countryStuff2, String countryStuff3, String countryStuff4, String countryStuff5) {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return name + ", (" + population + ")";
	}
	
	
	
	
}
