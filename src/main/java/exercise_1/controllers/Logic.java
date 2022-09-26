package exercise_1.controllers;

import java.util.HashMap;
import java.util.Map;
import exercise_1.models.*;
import exercise_1.types.StateValue;

public class Logic {

    private StoreManager storeManager;
    private FlowerShop flowerShop;
    private State state;
    private Map<StateValue, AceptorController> controllerMap;

    public Logic() {
        this.state = new State();
        this.storeManager= new StoreManager();
        this.flowerShop=new FlowerShop();
        
        this.controllerMap = new HashMap<StateValue, AceptorController>();
        this.controllerMap.put(StateValue.STORE_SELECTOR, new ManagementController(this.state, this.storeManager));
        this.controllerMap.put(StateValue.MAIN, new StoreController(this.state, this.flowerShop));
        this.controllerMap.put(StateValue.EXIT, null);
    }

    public AceptorController getController() {
        return this.controllerMap.get(this.state.getValueState());
    }
}
