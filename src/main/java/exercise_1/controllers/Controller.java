package exercise_1.controllers;

import exercise_1.models.State;
import exercise_1.types.StateValue;

public abstract class Controller {

	protected State state;

	public Controller(State state) {
		this.state = state;
	}
	
	public void setState(StateValue stateValue) {
		this.state.setState(stateValue);
	}
	
	public StateValue getStateValue () {
		return state.getValueState();
	}
}
