package it.skedenpio.names.service;

import it.skedenpio.names.domain.Name;

import java.util.List;

public class ListNameLookup implements INameLookup {

	private List<Name> names;
	
	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<Name> getNames() {
		return names;
	}
	
	public Name getNameById(int id) {
		Name name = names.get(id);
		return name;
	}

}
