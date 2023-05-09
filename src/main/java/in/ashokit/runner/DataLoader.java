package in.ashokit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repository.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {


	@Autowired
	private CitizenPlanRepository repo;

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		repo.deleteAll();
		
		//Cash Plan-1
				CitizenPlan c1=new CitizenPlan();
				c1.setCitizenName("Watson");
				c1.setGender("Male");
				c1.setPlanName("Cash");
				c1.setPlanStatus("Aproved");
				c1.setPlanStartDate(LocalDate.now());
				c1.setPlanEndDate(LocalDate.now().plusMonths(6));
				c1.setBenifitAmount(5000.00);
				
				//Cash Plan-2
						CitizenPlan c2=new CitizenPlan();
						c2.setCitizenName("Sony");
						c2.setGender("Female");
						c2.setPlanName("Cash");
						c2.setPlanStatus("Aproved");
						c2.setPlanStartDate(LocalDate.now());
						c2.setPlanEndDate(LocalDate.now().plusMonths(4));
						c2.setBenifitAmount(4000.00);
						
			//Cash Plan-3
						CitizenPlan c3=new CitizenPlan();
						c3.setCitizenName("Ravi");
						c3.setGender("Male");
						c3.setPlanName("Cash");
						c3.setPlanStatus("Denied");
						c3.setDeniedReason("Govt Job");
						
		  //Cash Plan-4
						CitizenPlan c4=new CitizenPlan();
						c4.setCitizenName("Teja");
						c4.setGender("Female");
						c4.setPlanName("Cash");
						c4.setPlanStatus("Denied");
						c4.setDeniedReason("Employed");
						
		//Cash Plan-5
						CitizenPlan c5=new CitizenPlan();
						c5.setCitizenName("Prasad");
						c5.setGender("Male");
						c5.setPlanName("Cash");
						c5.setPlanStatus("Terminated");
						c5.setPlanStartDate(LocalDate.now().minusMonths(2));
						c5.setTerminatedDate(LocalDate.now());
						c5.setTerminationReason("Over Due");
						
	//Cash Plan-6
						CitizenPlan c6=new CitizenPlan();
						c6.setCitizenName("Priyanka");
						c6.setGender("Female");
						c6.setPlanName("Cash");
						c6.setPlanStatus("Terminated");
						c6.setPlanStartDate(LocalDate.now().minusMonths(3));
						c6.setTerminatedDate(LocalDate.now());
						c6.setTerminationReason("Govt Job");
						
//Food Plan-1
						CitizenPlan c7=new CitizenPlan();
						c7.setCitizenName("Miller");
						c7.setGender("Male");
						c7.setPlanName("Food");
						c7.setPlanStatus("Aproved");
						c7.setPlanStartDate(LocalDate.now().minusMonths(1));
						c7.setPlanEndDate(LocalDate.now().plusMonths(6));
						c7.setBenifitAmount(5500.00);
						
//Food Plan-2
						CitizenPlan c8=new CitizenPlan();
						c8.setCitizenName("Dipika");
						c8.setGender("Female");
						c8.setPlanName("Food");
						c8.setPlanStatus("Aproved");
						c8.setPlanStartDate(LocalDate.now().minusWeeks(2));
						c8.setPlanEndDate(LocalDate.now().plusMonths(4));
						c8.setBenifitAmount(4500.00);
						
						
//Food Plan-3
									CitizenPlan c9=new CitizenPlan();
									c9.setCitizenName("Syam");
									c9.setGender("Male");
									c9.setPlanName("Food");
									c9.setPlanStatus("Denied");
									c9.setDeniedReason("Got Marrage");
									
									
//Food Plan-4
									CitizenPlan c10=new CitizenPlan();
									c10.setCitizenName("Shree");
									c10.setGender("Female");
									c10.setPlanName("Food");
									c10.setPlanStatus("Denied");
									c10.setDeniedReason("Employed");			
									
									
//Cash Plan-5
									CitizenPlan c11=new CitizenPlan();
									c11.setCitizenName("Naresh");
									c11.setGender("Male");
									c11.setPlanName("Food");
									c11.setPlanStatus("Terminated");
									c11.setPlanStartDate(LocalDate.now().minusMonths(3));
									c11.setTerminatedDate(LocalDate.now());
									c11.setTerminationReason("Fake Document");
									
//Cash Plan-6
									CitizenPlan c12=new CitizenPlan();
									c12.setCitizenName("Shiva");
									c12.setGender("Male");
									c12.setPlanName("Food");
									c12.setPlanStatus("Terminated");
									c12.setPlanStartDate(LocalDate.now().minusWeeks(2));
									c12.setTerminatedDate(LocalDate.now());
									c12.setTerminationReason("Adress Issue");
									
//Medical Plan-1
									CitizenPlan c13=new CitizenPlan();
									c13.setCitizenName("Vijay");
									c13.setGender("Male");
									c13.setPlanName("Medical");
									c13.setPlanStatus("Aproved");
									c13.setPlanStartDate(LocalDate.now());
									c13.setPlanEndDate(LocalDate.now().plusMonths(6));
									c13.setBenifitAmount(3300.00);
									
//Medical Plan-2
									CitizenPlan c14=new CitizenPlan();
									c14.setCitizenName("Kirty");
									c14.setGender("Female");
									c14.setPlanName("Medical");
									c14.setPlanStatus("Aproved");
									c14.setPlanStartDate(LocalDate.now().minusWeeks(5));
									c14.setPlanEndDate(LocalDate.now().plusMonths(6));
									c14.setBenifitAmount(3600.00);
									
//Medical Plan-3
									CitizenPlan c15=new CitizenPlan();
									c15.setCitizenName("Satya");
									c15.setGender("Male");
									c15.setPlanName("Medical");
									c15.setPlanStatus("Denied");
									c15.setDeniedReason("Verification Issue");
									
									
//Medical Plan-4
									CitizenPlan c16=new CitizenPlan();
									c16.setCitizenName("Dibya");
									c16.setGender("Female");
									c16.setPlanName("Medical");
									c16.setPlanStatus("Denied");
									c16.setDeniedReason("Employed");
									
//Medical Plan-5
									CitizenPlan c17=new CitizenPlan();
									c17.setCitizenName("Naresh");
									c17.setGender("Male");
									c17.setPlanName("Medical");
									c17.setPlanStatus("Terminated");
									c17.setPlanStartDate(LocalDate.now().minusMonths(2));
									c17.setTerminatedDate(LocalDate.now());
									c17.setTerminationReason("Wrong Document");
									
									
//Medical Plan-6
									CitizenPlan c18=new CitizenPlan();
									c18.setCitizenName("Killer");
									c18.setGender("Male");
									c18.setPlanName("Medical");
									c18.setPlanStatus("Terminated");
									c18.setPlanStartDate(LocalDate.now().minusWeeks(4));
									c18.setTerminatedDate(LocalDate.now());
									c18.setTerminationReason("Wrong Document");									
									

//Employment Plan-1
									CitizenPlan c19=new CitizenPlan();
									c19.setCitizenName("Dhoni");
									c19.setGender("Male");
									c19.setPlanName("Employment");
									c19.setPlanStatus("Aproved");
									c19.setPlanStartDate(LocalDate.now().minusMonths(3));
									c19.setPlanEndDate(LocalDate.now().plusMonths(3));
									c19.setBenifitAmount(4700.00);
									
//Employment Plan-2
									CitizenPlan c20=new CitizenPlan();
									c20.setCitizenName("Neha");
									c20.setGender("Female");
									c20.setPlanName("Employment");
									c20.setPlanStatus("Aproved");
									c20.setPlanStartDate(LocalDate.now().minusWeeks(1));
									c20.setPlanEndDate(LocalDate.now().plusMonths(6));
									c20.setBenifitAmount(5200.00);
									

//Employment Plan-3
									CitizenPlan c21=new CitizenPlan();
									c21.setCitizenName("Suraj");
									c21.setGender("Male");
									c21.setPlanName("Employment");
									c21.setPlanStatus("Denied");
									c21.setDeniedReason("Got Job");
									
									
//Employment Plan-4
									CitizenPlan c22=new CitizenPlan();
									c22.setCitizenName("Devi");
									c22.setGender("Female");
									c22.setPlanName("Employment");
									c22.setPlanStatus("Denied");
									c22.setDeniedReason("Employed");
																		
																	
//Employment Plan-5
									CitizenPlan c23=new CitizenPlan();
									c23.setCitizenName("Ashu");
									c23.setGender("Male");
									c23.setPlanName("Employment");
									c23.setPlanStatus("Terminated");
									c23.setPlanStartDate(LocalDate.now().minusWeeks(3));
									c23.setTerminatedDate(LocalDate.now());
									c23.setTerminationReason("Wrong Document");		
									
//Employment Plan-6
									CitizenPlan c24=new CitizenPlan();
									c24.setCitizenName("Hitesh");
									c24.setGender("Male");
									c24.setPlanName("Employment");
									c24.setPlanStatus("Terminated");
									c24.setPlanStartDate(LocalDate.now().minusWeeks(2));
									c24.setTerminatedDate(LocalDate.now());
									c24.setTerminationReason("Wrong Document");									
									
									
	List<CitizenPlan> list=Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24);								
									
	repo.saveAll(list);								
						
						
						
				
		
	}

}