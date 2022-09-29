package exercise_1.controllers;

import exercise_1.models.FlowerShop;
import exercise_1.models.Session;

public class ManagementController extends Controller implements AceptorController {

	public ManagementController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void setFlowerShop(FlowerShop flowerShop) {
		session.setFlowerShop(flowerShop);
	}

	public void saveFlowerShop() {
		
	}
}
