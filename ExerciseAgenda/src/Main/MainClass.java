package Main;

import Entities.Agenda;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		agenda.addPerson("Clarice", 21, (float)1.59);
		agenda.addPerson("Débora", 24, (float)1.61);
		int i = agenda.searchAgenda("Clarice");
		agenda.printPerson(i);
		agenda.printPerson(50);
		agenda.removePerson("Débora");
		agenda.printAgenda();
		agenda.removePerson("Teste");
	}

}
