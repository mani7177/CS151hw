package cs151hw3P_2;

public class Numbers {
	int yellowNumber;
	int blackNumber;
	int greenNumber;
	GraphView gView;
	
	public Numbers(int num1, int num2, int num3) {
		this.yellowNumber = num1;
		this.blackNumber = num2;
		this.greenNumber = num3;
	}
	
	public void attach(GraphView gv) {
		this.gView = gView;
	}
	
	public void updateNumbers(int num1, int num2, int num3) {
		this.yellowNumber = num1;
		this.blackNumber = num2;
		this.greenNumber = num3;
		gView.updateGraph(num1, num2, num3);
		
	}
	
}
