package exercise_1.controllers;

import java.util.HashMap;
import java.util.Map;
import exercise_1.models.*;
import exercise_1.types.StateValue;

public class Logic {

	private Session session;
    private Map<StateValue, AceptorController> controllerMap;

    public Logic() {
        this.session = new Session();
        
        this.controllerMap = new HashMap<StateValue, AceptorController>();
        this.controllerMap.put(StateValue.STORE_SELECTOR, new ManagementController(this.session));
        this.controllerMap.put(StateValue.MAIN, new StoreController(this.session));
        this.controllerMap.put(StateValue.EXIT, null);
    }

    public AceptorController getController() {
        return this.controllerMap.get(this.session.getValueState());
    }
}
