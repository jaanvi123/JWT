
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List myNums = new ArrayList();
		
		myNums.add(10);  //myNums.add(new Integer(10));
		myNums.add("Pune");	//myNums.add(new String("Pune");
		myNums.add("Ludhiana");
		
		for(Object obj:myNums)
		{
			System.out.println(obj);
		}
		
		
	}

}
