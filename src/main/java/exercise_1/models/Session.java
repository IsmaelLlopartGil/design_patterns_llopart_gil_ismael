package exercise_1.models;

import exercise_1.types.StateValue;

public class Session {

	private State state;
	private FlowerShop flowerShop;

	public Session() {
		this.state = new State();
		this.flowerShop = new FlowerShop();
	}

	public StateValue getValueState() {
		return state.getValueState();
	}

	public void setValueState(StateValue stateValue) {
		state.setState(stateValue);

	}

	public FlowerShop getFlowerShop() {
		return flowerShop;
	}

	public void setFlowerShop(FlowerShop flowerShop) {
		this.flowerShop = flowerShop;
	}

	public void addItem(Item item) {
		flowerShop.addItem(item);
	}

	public void removeItem(Item item) {
		flowerShop.removeItem(item);
	}
}
