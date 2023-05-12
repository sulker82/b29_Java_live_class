package Week06;

public class Address {
    /*
    Address [object type]

	create a class called Address
	declare these instance variables:
		street, city, state, zipcode, country

	create a setInfo() method to initialize these variables

	create a toString() that shows the full address in the following format
		$street
		$city, $state $zipcode
		$country

	create a different class and create some Address objects

     */
    String street;
    String city;
    String state;
    int zipcode;
    String country;

    public void setInfo(String street, String city, String state, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }
}
