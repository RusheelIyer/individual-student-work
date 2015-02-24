package homeLearning;

public class PublicPerson {
	
	String forename;
	String surname;
	String name;
	int birthYear;
	int age;
	
	public PublicPerson(String forename, String surname, int birthYear) {
	this.forename = forename;
	this.surname = surname;
	this.name = forename + " " + surname;
	this.birthYear = birthYear;
	this.age = 2015 - birthYear;
	}
	
	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getAge() {
		return age;
	}
}