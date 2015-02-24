
public class PrivatePerson {

String surName;
String name;
String foreName;
int birthYear;

public PrivatePerson(String surName, String foreName, int birthYear) {
this.birthYear=birthYear;
this.name=foreName+surName;

}

public int getAge() {
	return 2020 - birthYear;
}

public String getName(){
	return name;
    }
}