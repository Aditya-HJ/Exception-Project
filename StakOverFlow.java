package exeptionHandl;

public class StakOverFlow {
	public void add() {
		this.sub();
	}
	public void sub() {
		this.add();
	}
}
