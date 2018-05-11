package finalGradeCalc;

public class gradeObject {

	double score, percentage;
	String name;
	
	public gradeObject(int p, String n, int s) {
		score = s/100;
		name = n;
		percentage = s/100;
	}
	
	public double getScore() {
		return score;
	}
	public double getPercentage() {
		return percentage;
	}
	public String getName()  {
		return name;
	}
	public void setScore(int s) {
		score = s/100;
	}
	public void setPercentage(int p) {
		percentage = p/100;
	}
	public void setName(String n) {
		name = n;
	}
}
