package exercise_1.controllers;

import exercise_1.models.Session;
import exercise_1.types.StateValue;

public abstract class Controller {

	protected Session session;

	public Controller(Session session) {
		this.session = session;
	}
	
	public void setState(StateValue stateValue) {
		this.session.setValueState(stateValue);
	}
	
	public StateValue getStateValue () {
		return session.getValueState();
	}
}
