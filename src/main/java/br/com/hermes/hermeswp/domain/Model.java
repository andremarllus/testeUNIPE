package br.com.hermes.hermeswp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class Model<ID> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ID id;

	private LocalDateTime creationDate;

	private LocalDateTime lastUpdateDate;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public void valid() {
	}

	// Se o id for nulo é por que trata-se de um model não persitido.
	// O mesmo se for um int zerado ou um Long zerado.
	public boolean isNew() {
		if (this.getId() == null || this.getId().equals(0L) || this.getId().equals(0)) {
			return true;
		}
		return false;
	}

	private void doPrePersist() {
		this.valid();
		this.validBeforeRegister();
		this.doBeforeRegister();
		this.setCreationDateBeforeRegister();
	}

	public void validBeforeRegister() {
	}

	public void doBeforeRegister() {
	}

	private void setLasUpdateDateBeforeAlter() {
		this.setLastUpdateDate(LocalDateTime.now());
	}

	private void doPreUpdate() {
		this.valid();
		this.validBeforeAlter();
		this.doBeforeAlter();
		this.setLasUpdateDateBeforeAlter();
	}

	public void validBeforeAlter() {
	}

	public void doBeforeAlter() {
	}

	private void setCreationDateBeforeRegister() {
		this.setCreationDate(LocalDateTime.now());
	}

}