package ru.redhat.itopcase.bpa.demo.data;

public class Result {
	private boolean approved;
	private User approver;
	
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
