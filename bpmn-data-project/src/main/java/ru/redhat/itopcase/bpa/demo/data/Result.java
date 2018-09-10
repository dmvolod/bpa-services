package ru.redhat.itopcase.bpa.demo.data;

import java.io.Serializable;

public class Result implements Serializable {
	private static final long serialVersionUID = 6948016851862911872L;
	
	private boolean approved;
	private User approver;
	
	public Result() {
	}
	
	public Result(boolean approved, User approver) {
		this.approved = approved;
		this.approver = approver;
	}
	
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public User getApprover() {
		return approver;
	}
	public void setApprover(User approver) {
		this.approver = approver;
	}
}
