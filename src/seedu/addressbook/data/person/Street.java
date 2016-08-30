package seedu.addressbook.data.person;

public class Street {
     //data members
	 private String street;
	 //constructor
	 public Street (String str){
		 street = str;
	 }
	 //mutator method
	 public void setStreet (String street) {
		 this.street = street;
	 }
	 //accessor method
	 public String getStreet () {
		 return street;
	 }
}