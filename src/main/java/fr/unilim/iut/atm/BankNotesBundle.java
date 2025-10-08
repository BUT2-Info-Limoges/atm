package fr.unilim.iut.atm;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BankNotesBundle {

	private final BankNote bankNote;
	private final int numberOfNotes;

	public BankNotesBundle(BankNote bankNote, int numberOfNotes) {
		this.bankNote = bankNote;
		this.numberOfNotes = numberOfNotes;
	}

	@Override
	public String toString() {
		return ("" + this.numberOfNotes + " * " + this.bankNote.denomination());
	}

}
