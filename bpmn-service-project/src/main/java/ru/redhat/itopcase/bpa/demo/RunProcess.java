package ru.redhat.itopcase.bpa.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;

import ru.redhat.itopcase.bpa.demo.data.User;

public class RunProcess {
    // jBPM Process and Project constants
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
    private static final String CONTAINER_ID = "bpa-project_1.0.0-SNAPSHOT";
    private static final String PROCESS_ID = "Vacation";
    private static final String SERVER_URL = "http://myapp-kieserver-pam70.apps.ose.rht.mont.com/services/rest/server";

	public static void main(String[] args) {
		KieServicesConfiguration config =  KieServicesFactory.newRestConfiguration(SERVER_URL, USERNAME, PASSWORD);
		config.setMarshallingFormat(MarshallingFormat.JSON);
		
		Set<Class<?>> extraClassList = new HashSet<Class<?>>();
		extraClassList.add(User.class);
		
		config.addExtraClasses(extraClassList);
		
        KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
        

		ProcessServicesClient processServices = client.getServicesClient(ProcessServicesClient.class);
		
		Map<String, Object> params = new HashMap<String, Object>();
		User user = new User();
		user.setUserId("admin");
		user.setUserName("Administrator");
		
		params.put("user", user);

        Long processInstanceId = processServices.startProcess(CONTAINER_ID, PROCESS_ID, params);

        System.out.println("Start Evaluation process " + processInstanceId);
	}

}
