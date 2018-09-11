package ru.redhat.itopcase.bpa.demo.wih;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class ApproveWorkItemHandler implements WorkItemHandler {

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		 manager.abortWorkItem(workItem.getId());
	}

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		System.out.println("ApproveWorkItemHandler executed");
		manager.completeWorkItem(workItem.getId(), null);
	}


}