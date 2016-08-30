package seedu.addressbook.data.person;

public class Unit {
     //data members
	 private String unit;
	 //constructor
	 public Unit (String str){
		 unit = str;
	 }
	 //mutator method
	 public void setUnit (String unit) {
		 this.unit = unit;
	 }
	 //accessor method
	 public String getUnit () {
		 return unit;
	 }
}