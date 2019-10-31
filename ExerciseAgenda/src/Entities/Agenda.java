package Entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<People> peopleList = new ArrayList<People>();
	
	public void addPerson(String name, int age, float height) {
		if (peopleList.size() == 10 ) System.out.println("Agenda cheia!");
		else peopleList.add(new People(name, age, height));
	}
	
	public void removePerson(String name) {
		for (People person : peopleList) {
	        if (person.getName().equals(name)) {
	        	peopleList.remove(person);
	        	return;
	        }
	    }
		System.out.println("Contato não encontrado!");
	}
	
	public int searchAgenda(String name) {
		for (People person : peopleList) {
	        if (person.getName().equals(name)) {
	        	return peopleList.indexOf(person);
	        }
	    }
		return -1;
	}
	
	public void printAgenda() {
		System.out.println("Contatos");
		for (People person : peopleList) {
			StringBuilder builder = new StringBuilder();
			builder.append("Nome: ").append(person.getName()).append(" - Idade: ").append(String.valueOf(person.getAge())).append(" - Altura: ").append(String.valueOf(person.getHeight()));
			System.out.println(builder.toString());
		}
	}
	
	public void printPerson(int i) {
		if (i < 0 || i >= peopleList.size()) System.out.println("Contato não encontrado!");
		else {
			StringBuilder builder = new StringBuilder();
			builder.append("Nome: ").append(peopleList.get(i).getName()).append(" - Idade: ").append(String.valueOf(peopleList.get(i).getAge())).append(" - Altura: ").append(String.valueOf(peopleList.get(i).getHeight()));
			System.out.println(builder.toString());
		}
	}
}
	
