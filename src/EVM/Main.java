package EVM;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EVM obj1=new EVM();
		int voters=0;
		obj1.setConstituency("*************Elections For Constituency Panjim******************");
		System.out.println("No Of Candidates Ready To Contest--3");
		
        obj1.bu.ss.setNumberOfUnit(1);  //As number of candidates 3
        
		System.out.println("----------EVM Machine Set---------");
		System.out.println("*****COntrol Unit and Ballot Unit On********");
		
		
		
		
		System.out.println(obj1.getConstituency());
		
		
		obj1.bu.bl.glowOnReadyLamp();
		
		for(int i=0;i<=4;i++){
			Random rn = new Random();
			int answer = rn.nextInt(5) + 1;
			 voters++;
			 
		//obj1.cu.bs.PressBallotButton();
		obj1.setCandidateVoteNumber(answer);
		
		obj1.Vote(obj1.getCandidateVoteNumber());
		System.out.println("\nVoter"+voters);obj1.bu.CB.PressButton();
		obj1.bu.bl.glowOnCandidateLamp();
		obj1.cu.ds.glowOnBusyLamp();
		}
		
	    obj1.displayTotal();
	    obj1.clear();
	    obj1.displayTotal();
	  
		

	
	System.out.println("*****COntrol Unit and Ballot Unit OFF********");
	}

}
