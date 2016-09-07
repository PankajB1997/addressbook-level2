package seedu.addressbook.data.person;

public class Contact {

	public final String value;
    protected boolean isPrivate;

    public Contact(String val, boolean isPrivate) {
    	value = val;
    	this.isPrivate = isPrivate;
    }
    
    @Override
    public String toString(){
    	return value;
    }
    
    public static boolean isValidContact(String test, String regex){
    	return test.matches(regex);
    }
    
    @Override
    public int hashCode(){
    	return value.hashCode();
    }
    
    public boolean isPrivate(){
    	return isPrivate;
    }
}
