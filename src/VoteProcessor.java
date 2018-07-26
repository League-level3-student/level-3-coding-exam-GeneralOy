import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int can1 = 0;
		int can2 = 0;
		String can1name= votes.get(0).toLowerCase();
		String can2name = "";
		for(String vote : votes) {
			if(can1name.equals(vote.toLowerCase())) {
				can1name = vote.toLowerCase();
				can1 ++;
			}else {
				can2name = vote.toLowerCase();
				can2 ++;
			}
		}
		if(can1 > can2) {
			return can1name;
		}else if(can1 < can2) {
			return can2name;
		}else if(can1 == can2) {
			return "TIE";
		}
		return "Vote failed";
	}

}
