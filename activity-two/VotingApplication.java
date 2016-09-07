
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class VotingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathCandidates= "./candidate.txt"; 
		String pathVoters = "./voters.txt";
		Candidate[] candidates =null;
		Voter[] voters =null;
		try{
			candidates = getCandidates(pathCandidates);
			voters = getVoters(pathVoters);
			Candidate winner = getWinner(candidates , voters);
			JOptionPane.showMessageDialog(null, "The winner is: " + winner.toString());
		}
		catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
	}
	
	
	public static Candidate[] getCandidates(String path) throws FileNotFoundException,
	IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String line; 
		Scanner scan = null; 
		int count=0;
		while((line = br.readLine()) !=null){
			count++;
		}
		
		br = new BufferedReader(new FileReader(new File(path)));
		Candidate c; 
		String name;
		int code; 
		Candidate[] candids = new Candidate[count];
		int i=0;
		while((line = br.readLine()) !=null){
			scan =new Scanner(line);
			scan.useDelimiter(",");
			name = scan.next(); 
			code = Integer.parseInt(scan.next().trim());
			c= new Candidate(name , code);
			candids[i++]=c;
		}

		return candids;
		
	}
	
	public static Voter[] getVoters(String path) throws FileNotFoundException,
	IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String line; 
		Scanner scan = null; 
		int count=0;
		while((line = br.readLine()) !=null){
			count++;
		}
		
		br = new BufferedReader(new FileReader(new File(path)));
		Voter v; 
		char gender;
		int code; 
		Voter[] voters = new Voter[count];
		int i=0;
		while((line = br.readLine()) !=null){
			scan =new Scanner(line);
			scan.useDelimiter(",");
			gender = scan.next().trim().charAt(0); 
			code = Integer.parseInt(scan.next().trim());
			v= new Voter(gender);
			v.setVote(code);
			voters[i++]=v;
		}

		return voters;
		
	}
	
	public static Candidate getWinner(Candidate[] candids, Voter[] voters){
		//TODO
		int candidateNumber = candids.length; 
		int numberOfVoters = voters.length;
		int i, j;

		Bucket[] candidateBucket = new Bucket[candidateNumber];

		for (i = 0; i < candidateNumber; i += 1) {

			candidateBucket[i] = new Bucket(numberOfVoters, candids[i].getCode());

		}

		for (i = 0; i < candidateBucket.length; i += 1) {

			for (j = 0; j < numberOfVoters; j += 1) {

				if (voters[j].getVote() == candidateBucket[i].getKey()) {

					candidateBucket[i].add(voters[j]);

				}

			}

		}

		int maxCandidateKey = candidateBucket[0].getKey();
		int maxCandidateVotes = candidateBucket[0].getSize();
		for (i = 0; i < candidateNumber; i += 1) {

			if (candidateBucket[i].getSize() > maxCandidateVotes) {

				maxCandidateVotes = candidateBucket[i].getSize();
				maxCandidateKey = candidateBucket[i].getKey();

			}

		}

		return candids[maxCandidateKey - 1];

	}

}
