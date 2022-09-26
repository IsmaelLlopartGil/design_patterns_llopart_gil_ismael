package exercise_1.views.menus;

import com.liche.utils.console.command_menu.CommandConsoleMenu;
import exercise_1.controllers.ManagementController;
import exercise_1.views.menus.ExitCommand;
import exercise_1.views.menus.NewStoreCommand;

public class ManagementMenu extends CommandConsoleMenu {

	public ManagementMenu(ManagementController managementController) {
		this.addOption(new ExitCommand(managementController));
		this.addOption(new NewStoreCommand(managementController));
		//PERSISTENCIA CARGA LAS OPCIONES PARA SELECCIONAR TIENDA
	}
}
