package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
private List<Command> comenzi;

public ManagerComenzi() {
	super();
	this.comenzi = new ArrayList<>();
}

public void invoca(Command comanda) {
	comenzi.add(comanda);
}

public void executaComanda() {
	if (!comenzi.isEmpty()) {
		comenzi.get(0).executa();
		comenzi.remove(0);
	}
}
}
