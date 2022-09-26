package exercise_1.views;

public enum Message {
    MANAGEMENT_MENU_TITLE("--- LICHE STORE MANAGER ---"),
    HORIZONTAL_LINE("---------------------------"),
    EXIT_COMMAND_TITLE("Sortir"),
	NEW_STORE_COMMAND_TITLE("Nova Floristeria"),
	RETURN_TO_MANAGEMENT_COMMAND_TITLE("Selecció de botiga"),
	ADD_DECOR_COMMAND_TITLE("Afegir decoració"),
	ADD_FLOWER_COMMAND_TITLE("Afegir flor"),
	ADD_TREE_COMMAND_TITLE("Afegir arbre"),
	GENERATE_INVOICE_COMMAND_TITLE("Generar factura"),
	REMOVE_DECOR_COMMAND_TITLE("Eliminar decoració"),
	REMOVE_FLOWER_COMMAND_TITLE("Eliminar flor"),
	REMOVE_TREE_COMMAND_TITLE("Eliminar arbre"),
	SHOW_EARNINGS_COMMAND_TITLE("Mostrar guanys"),
	SHOW_INVOICES_COMMAND_TITLE("Mostrar factures"),
	SHOW_STOCK_COMMAND_TITLE("Mostrar stock"),
	
	
	LAST("");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
