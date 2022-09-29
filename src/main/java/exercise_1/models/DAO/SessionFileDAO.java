package exercise_1.models.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import exercise_1.models.Session;

public class SessionFileDAO {

    public static final String EXTENSION = ".mm";
	public static final String DIRECTORY = "./saves";
	private static File directory;
	
	static {
		SessionFileDAO.directory = new File(SessionFileDAO.DIRECTORY);
	}
	
	private Session session;
	private FlowerShopDAO flowerShopDAO;
	
	public void associate(Session session) {
		this.session = session;
		this.flowerShopDAO = new FlowerShopDAO(this.session.getShop());
	}
	
    public void load(String name) {
		this.session.setName(name);
		File file = new File(SessionFileDAO.directory, name);
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			this.flowerShopDAO.load(bufferedReader);
			this.session.resetRegistry();
			this.session.registry();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
        }
        this.session.setValueState(StateValue.IN_GAME);
		if (this.session.isTicTacToe()) {
            this.session.setValueState(StateValue.RESUME);
		}
	}
    
	public void save() {
		this.save(this.session.getName());
	}

	public void save(String name) {
		if (name.endsWith(SessionFileDAO.EXTENSION)) {
			name = name.replace(SessionFileDAO.EXTENSION, "");
		}
		File file = new File(SessionFileDAO.directory, name + SessionFileDAO.EXTENSION);
		try {
			FileWriter fileWriter = new FileWriter(file);
			this.flowerShopDAO.save(fileWriter);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String[] getShopNames() {
		return SessionFileDAO.directory.list();
	}

	public boolean exists(String name) {
		for (String auxName : this.getShopNames()) {
			if (auxName.equals(name + SessionFileDAO.EXTENSION)) {
				return true;
			}
		}
		return false;
	}
}
