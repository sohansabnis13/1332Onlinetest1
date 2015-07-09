package EVM;

public class EVM {
	
	ControlUnit cu=new ControlUnit();
	BallotUnit bu=new BallotUnit();
	//String[] names=new String[3];
	   String[] namesofCandidate = {"Vijay", "Digamber", "Vishwajeet"};
	   
	   int[] users={1,2,3,4,5};
		int count,count1,count2=0;

       
	   int CandidateVoteNumber;
	   
	
	public int getCandidateVoteNumber() {
		return CandidateVoteNumber;
	}

	public void setCandidateVoteNumber(int candidateVoteNumber) {
		CandidateVoteNumber = candidateVoteNumber;
	}


	public String constituency;
	   


	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	
	
	public void Vote(int number){
		//names[0]="ABC";
        if(number==1){			
		count++;
	}
    if(number==2){			
		
		count1++;

	}
	
if(number==3){			
	count2++;


}


	
	
	}
	
	void displayTotal(){
		System.out.println("Total Votes For Candidate One-"+count);
		System.out.println("Total Votes For Candidate two-"+count1);
		System.out.println("Total Votes For Candidate three-"+count2);

	}

}
