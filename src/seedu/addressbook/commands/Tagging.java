package seedu.addressbook.commands;

import seedu.addressbook.data.tag.Tag;

public class Tagging {

	private String updatedTag;
	
	private String prepareTagForAddition(boolean add, String name, Tag tag){
		if(add){
			return "+ "+name+" "+tag.toString();
		}
		else return "- "+name+" "+tag.toString();
	}
	
	public void addTag(boolean add, String name, Tag tag) {
		updatedTag = prepareTagForAddition(add, name, tag);
	}
	
	public String fetchUpdatedTag(){
		return updatedTag;
	}
}
