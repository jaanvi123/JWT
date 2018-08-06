
public class InheritanceActivity {

	public static void main(String[] args) {
		
		Manager mobj = new Manager(126534,237844,"Peter","Chennai India",65000);
		System.out.println(mobj.transportAllowance());
		
		Trainee tobj = new Trainee(126537,237848,"Robert","Chennai India",1000);
		System.out.println(tobj.transportAllowance());
		
		
	}

}
