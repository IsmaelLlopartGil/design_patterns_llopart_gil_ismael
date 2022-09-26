package exercise_1.views.menus;

import com.liche.utils.console.command_menu.Command;
import exercise_1.controllers.ManagementController;
import exercise_1.views.Message;

public class NewStoreCommand extends Command {

	private ManagementController managementController;

	public NewStoreCommand(ManagementController managementController) {
		super(Message.NEW_STORE_COMMAND_TITLE.toString());
		this.managementController = managementController;
	}

	@Override
	public void execute() {

	}

	@Override
	public boolean isActive() {
		return false;
	}

}
