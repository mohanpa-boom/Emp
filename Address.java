package beans;

public class Address {
	private int addressId;
	private String address1;
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Address(int addressId, String address1, String city, String state) {
		super();
		this.addressId = addressId;
		this.address1 = address1;
		this.city = city;
		this.state = state;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + address1 + ", city=" + city + ", state="
				+ state + "]";
	}

}
