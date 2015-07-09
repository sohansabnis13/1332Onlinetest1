package EVM;

public class EVM {
	
	ControlUnit cu=new ControlUnit();
	BallotUnit bu=new BallotUnit();
	//String[] names=new String[3];
	   String[] namesofCandidate = {"Vijay", "Digamber", "Vishwajeet"};


	
	public String constituency;
	   


	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	
	
	public void Vote(){
		//names[0]="ABC";
		for(int i=0;i<1;i++){
			
		
		System.out.println(namesofCandidate[i]);
	}
	
	}

}
