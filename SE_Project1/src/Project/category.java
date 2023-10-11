package Project;
import java.util.ArrayList;

import java.util.ArrayList;

import java.util.Collections;


public class category {

	String name;

	ArrayList<group> groups;

	public category(String name) {
		this.name = name;
		this.groups = new ArrayList<group>();

	}


	public String getName() {
		return name;
	}
	
	public boolean addGroup(group g) {	
		if (Validator.validateGroupNameExists(groups, g.getName())) {	//If the name of group g already exists within the list of Groups
			return false;	//do not add the group and return false
		}
		else {
			groups.add(g);	//else, add the group	NOTICE: This may require more variables as the Group class is updated
			return true;	//and return true
		}
	}
	
	public boolean createGroup(String name) {
		if(Validator.validateGroupNameExists(groups, name)) {	//If there exists a group with the given name
			return false;	//Return false
		}
		else {	
			group g = new group(name);	//else, create the group	NOTICE: This may require more variables as the Group class is updated
			groups.add(g);		//add group
			return true;		//and return true
		}
	}

	
	public ArrayList<group> getGroupsAlphabetically() {
		Collections.sort(groups, new SortGroupsByName());
		
		return groups;
	}


	@Override
	public String toString() {
		return "category [name=" + name + ", groups=" + groups + "]";
	}



	public ArrayList<group> getGroups() {
		return groups;
	}

}
