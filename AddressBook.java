package Day10_AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<Person> contact = new ArrayList<Person>();
	static Scanner scan = new Scanner(System.in);
	static int totalObj = 0;

	public static void main(String[] args) {
		int ans = 1;
		while (ans == 1) {
			System.out.println("Enter Contact");
			Person p = new Person();
			getInfo(p);
			contact.add(p);
			System.out.println("Want to Add more? Enter 1 for Yes, 2 for No");
			ans = scan.nextInt();
			totalObj += 1;
		}

		System.out.println("Want to Edit? Enter 1 for Yes, 2 for No");
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() == 1) {
			searchPerson();
		}

		System.out.println("Want to Delete? Enter 1 for Yes, 2 for No");
		if (sc.nextInt() == 1) {
			deletePerson();
		}
	}

	public static void deletePerson() {
		System.out.println("\nEnter Fisrt Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		int flag = 0;
		for (int i = 0; i < totalObj; i++) {
			if (firstName.equals(contact.get(i).fName)) {
				contact.remove(i);
				totalObj -= 1;
				System.out.println("Deleted..!!");
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Couldn't Find it!");
		}
	}

	public static void searchPerson() {
		System.out.println("\nEnter Fisrt Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		int flag = 0;
		for (int i = 0; i < totalObj; i++) {
			System.out.println(contact.get(i).fName);
			if (firstName.equals(contact.get(i).fName)) {
				System.out.println("\nEdit---->");
				getInfo(contact.get(i));
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Couldn't Find it!");
		}
	}

	public static void getInfo(Person p1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String str = sc.next();
		p1.setfName(str);
		System.out.println("Enter Last name: ");
		str = sc.next();
		p1.setlName(str);
		System.out.println("Enter Address: ");
		p1.setAddress(sc.next());
		System.out.println("Enter City: ");
		p1.setCity(sc.next());
		System.out.println("Enter State: ");
		p1.setState(sc.next());
		System.out.println("Enter Zip: ");
		p1.setZip(sc.nextInt());
		System.out.println("Enter Phone Number: ");
		p1.setpNumber(sc.nextLong());
		System.out.println("Enter Email: ");
		p1.setEmail(sc.next());
	}
}

class Person {
	String fName;
	String lName;
	String address;
	String city;
	String state;
	int zip;
	long pNumber;
	String email;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getpNumber() {
		return pNumber;
	}

	public void setpNumber(long pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}