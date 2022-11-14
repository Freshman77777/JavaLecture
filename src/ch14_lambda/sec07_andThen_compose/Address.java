package ch14_lambda.sec07_andThen_compose;

public class Address {
	private String country;
	private String city;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	
}
