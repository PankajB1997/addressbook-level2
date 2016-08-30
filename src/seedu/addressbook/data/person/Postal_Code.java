package seedu.addressbook.data.person;

public class Postal_Code {
     //data members
	 private String postal_code;
	 //constructor
	 public Postal_Code (String str){
		 postal_code = str;
	 }
	 //mutator method
	 public void setPostalCode (String postal_code) {
		 this.postal_code = postal_code;
	 }
	 //accessor method
	 public String getPostalCode () {
		 return postal_code;
	 }
}