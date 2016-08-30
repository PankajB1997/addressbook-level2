package seedu.addressbook.data.person;

public class Block {
     //data members
	 private String block;
	 //constructor
	 public Block (String str){
		 block = str;
	 }
	 //mutator method
	 public void setBlock (String block) {
		 this.block = block;
	 }
	 //accessor method
	 public String getBlock () {
		 return block;
	 }
}