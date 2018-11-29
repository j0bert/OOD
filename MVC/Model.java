package mvc;

public class Model {
	
	private int ans;
	
	public void add(int first, int second){
		ans = first + second;
	}

	public void subtract(int first, int second){
		ans = first - second;
	}
	
	public void multiply(int first, int second){
		ans = first * second;
	}
	
	public void divide(int first, int second){
		ans = first / second;
	}
	
	public int getAns(){
		return ans;
	}
}
