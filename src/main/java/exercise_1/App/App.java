package exercise_1.App;


import exercise_1.controllers.*;
import exercise_1.views.*;

public class App {

    private View view;
    private Logic logic;
    
    public App() {
		this.logic=new Logic();
		this.view=new ConsoleView();
	}
	
	private void run() {
        AceptorController aceptorController;
        
        do {
        	aceptorController = logic.getController();
        	
            if (aceptorController != null)
            	aceptorController.accept(this.view);
            
        } while (aceptorController != null);
	}

	public static void main(String[] args) {
		new App().run();
	}
}
