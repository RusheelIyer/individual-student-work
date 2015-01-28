class PublicPerson {
    String foreName;
	String surName;
	int birthYear;
	String name;
	int age;
	
	public PublicPerson(String foreName, String surName, int birthYear){
		this.name = foreName + surName;
		this.age = 2015 - birthYear;
	}
	
	public String getForeName(){
		return foreName;
	}
	
	public String getSurName(){
		return surName;
	}
	
	public int getBirthYear(){
		return birthYear;
	}
    
}

class PrivatePerson {
    String foreName;
	String surName;
	int birthYear;
	String name;
	
	public PrivatePerson(String foreName, String surName, int birthYear) {
		this.name = foreName + surName;
		this.birthYear = birthYear;
	}

	public int getAge() {
		return 2015 - birthYear;
	}
	
	public String getName(){
		return name;
		}
}

public class Visibility {
    
    private static String whoIsOlder(PrivatePerson personOne, PublicPerson personTwo) {
		if(personOne.getAge() > personTwo.age){
			return personOne.getName();
		} else{
			return personTwo.name;
		}
	}
    public static void main(String[] args) {
        PrivatePerson personOne = new PrivatePerson("James", "Smith", 2005);
        System.out.println("Created a new person " + personOne.getName()
            + " who is " + personOne.getAge() + " years old");

        PublicPerson personTwo = new PublicPerson("Dave", "Jones", 1989);

        System.out.println("Created a new person " + personTwo.name
            + " who is " + personTwo.age + " years old");

        String oldestName = whoIsOlder(personOne, personTwo);

        System.out.println("The oldest person is " + oldestName);

    }
}

