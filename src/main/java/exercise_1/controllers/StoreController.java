package exercise_1.controllers;

import exercise_1.models.FlowerShop;
import exercise_1.models.State;

public class StoreController extends Controller implements AceptorController {

	private FlowerShop flowerShop;

	public StoreController(State state, FlowerShop flowerShop) {
		super(state);
		this.flowerShop = flowerShop;
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
