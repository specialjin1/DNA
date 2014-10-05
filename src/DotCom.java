import java.util.*;

public class DotCom {

	private ArrayList<String> locationCells;
	private String name;
	// int numOfHits = 0; ¾ø¾îµµ µÊ
	
	public void setLocationCells(ArrayList<String> locs)
	{
		locationCells = locs;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput)
	{
		String status = "miss";
		int index = locationCells.indexOf(userInput);
		
		if(index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				System.out.println(name);
				status = "kill";
			} else {
				status = "hit";
			}
		}
		return status;
	}
}