package exercise_1.controllers;

import exercise_1.models.State;
import exercise_1.models.StoreManager;

public class ManagementController extends Controller implements AceptorController {

	private StoreManager storeManager;

	public ManagementController(State state, StoreManager storeManager) {
		super(state);
		this.storeManager = storeManager;
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}
