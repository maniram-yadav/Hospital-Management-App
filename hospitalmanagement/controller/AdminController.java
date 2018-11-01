package org.hospital.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hospital.beans.*;
import org.hospital.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {
	
	AdminService adminService=new AdminService();
	
	
	
	@RequestMapping(value="/admin/{value}",method=RequestMethod.GET)
	public ModelAndView adminPage(@PathVariable("value") String htmlpage){
	
		if(htmlpage.equalsIgnoreCase("header"))
		      return new ModelAndView("admin/adminheader");
		
		else if(htmlpage.equalsIgnoreCase("dashboard"))
				return new ModelAndView("admin/dashboard");

		else if(htmlpage.equalsIgnoreCase("departmentnav"))
				return new ModelAndView("admin/departmentbar");

		else 
				return new ModelAndView("admin/addepartment");

	}
	


	
	
	
	@RequestMapping(value="/form/{employee}",method=RequestMethod.GET)
	public ModelAndView DoctorForm(@PathVariable("employee") String type){
		ModelAndView modelAndView; 
		if(type.equals("doctor"))
		{
			List<Department> list= adminService.getAllDepartment();	
		  modelAndView=new ModelAndView("admin/adddoctor","list",list);
		}	
		else if(type.equals("employee")){
			modelAndView=new ModelAndView("admin/addemployee","","");
		}
		else if(type.equals("depart")){
			modelAndView=new ModelAndView("admin/addepartment","","");
		}
		else {
			modelAndView=new ModelAndView("admin/addepartment","","");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/add/{emp}",method=RequestMethod.GET)
	public String addDoctor( @PathVariable("emp") String emp,
			
			@RequestParam("txtuserid") String txtuserid,
			@RequestParam("password") String password,
			
			@RequestParam("txtlname") String txtlname,
			@RequestParam("txtemail") String txtemail,
			@RequestParam("txtfname") String txtfname,
			@RequestParam("position") String position,
			@RequestParam("txtpincode") String txtpincode,
			@RequestParam("txtcity") String txtcity,
			@RequestParam("txtcountry") String txtcountry,
			@RequestParam("txtaddress") String txtaddress,
			@RequestParam("txtstate") String txtstate,
			@RequestParam("txtcontact") String txtcontact,
			@RequestParam("radsex") String radsex
			){
		
		int b;
		
		int pincode=Integer.parseInt(txtpincode);
		String txtname=txtfname+" "+txtlname;
		Employees employees=new Employees(txtname,0, radsex, txtemail, txtcontact, txtaddress, txtcity, txtstate, txtcountry,pincode);
	
	    
		 
	    if(emp.equals("doctor")){
	    	{
	    	Employee_Logins employee_Logins=new Employee_Logins(employees, txtuserid, password,"Doctor");
	            
		b=adminService.addDoctor(position,employees, employee_Logins);
	    	}
		
		System.out.println("d  "+b);
	        if(b>0)
	           return "Doctor Information Successfully Saved";
	        else
	            return "Unable to save information";
	
	        
         }
	    
	    
         else{
        	 Employee_Logins employee_Logins=new Employee_Logins(employees, txtuserid, password,position);
     	        b=adminService.addEmployee(employee_Logins,employees);
     if(b>0)
        		 return b+"Employee Information Successfully Saved";
        	 else
 	            return b+"Unable to save information";
 	
           }
	
     //   return new ModelAndView("admin/new");
        
 		
	}
	
	
	@RequestMapping(value="/addd/depart",method=RequestMethod.GET)
	public ModelAndView addDepartment(
			@RequestParam("userid") String userid,
			@RequestParam("password") String password)
	
	{
	return new ModelAndView("");	
}
	
	

	@RequestMapping(value="/adddepart",method=RequestMethod.POST)
	public String addDepart(
			@RequestParam("txtdepart") String txtdepart,
			@RequestParam("txtdesc") String txtdesc)
	
	{
		Department department=new Department(txtdepart,txtdesc);
		int a=adminService.addDepartment(department);
	    if(a>0)
		       return "Department Added";
	    else
	    	return "Unable to add new Department";	
}

	
	
	@RequestMapping(value="/get/doctor",method=RequestMethod.GET,produces="application/json")
	public List<Doctors> getAllDoctors(){
	  
		List<Doctors> list=new ArrayList<Doctors>();
		list=adminService.getAllDoctors();
		return list;
	}


	@RequestMapping(value="/get/{employee}",method=RequestMethod.GET,produces="application/json")
	
	public List<Employee_Logins> getAllDoctors(@PathVariable("employee") String employee){
	  
		List<Employee_Logins> list=new ArrayList<Employee_Logins>();
    
		if(employee.equalsIgnoreCase("Nurse"))
		{
		list=adminService.getEmployees("Nurse");
		}
       else  if(employee.equalsIgnoreCase("Laborist"))
		{
		list=adminService.getEmployees("Laborist");
		}
       else if(employee.equalsIgnoreCase("Pharmasist"))
		{
		list=adminService.getEmployees("Pharmasist");
		}
       else if(employee.equalsIgnoreCase("Accountant"))
		{
		list=adminService.getEmployees("Accountant");
		}
       else
		{
		list=adminService.getEmployees("Subadmin");
		}
     return list;
      	}
	
	
	@RequestMapping(value="/getaction/{navbar}",method=RequestMethod.GET)
	
	public ModelAndView departmentBar(@PathVariable("navbar") String navbar){
		ModelAndView modelAndView; 
	
		if(navbar.equals("doctor"))
	  	        modelAndView=new ModelAndView("admin/doctornavbar");
		else if(navbar.equals("Nurse"))
			modelAndView=new ModelAndView("admin/nursenav");
		else if(navbar.equals("Pharmasist"))
			modelAndView=new ModelAndView("admin/pharmasistbar");
		else if(navbar.equals("Accountant"))
			modelAndView=new ModelAndView("admin/accountantbar");
		else if(navbar.equals("Subadmin"))
			modelAndView=new ModelAndView("admin/subadminbar");
		else if(navbar.equals("Laborist"))
			modelAndView=new ModelAndView("admin/laboristbar");
       else 
			modelAndView=new ModelAndView("admin/doctornavbar");
			
		return modelAndView;
	}
	
	
	
	
	
	
	@RequestMapping(value="/delete/{emp}/{id}")

	public String deleteeEmployee(@PathVariable("emp") String str,
			@PathVariable("id") int id){
		if(str.equals("doctor"))
		      adminService.deleteDoctor(id);
		  else
			adminService.deleteEmployee(id);
			
		return "Successfuly deleted";
	}
	
	
	@RequestMapping(value="getdoctor/department",method=RequestMethod.GET,produces="application/json")
	public List<Department> getAllDepartment(){
		return adminService.getAllDepartment();
	}
	
	
	@RequestMapping(value="deldepart/{id}",method=RequestMethod.GET,produces="application/json")
	public List<Department> deleteDepartment(@PathVariable("id") String id){
		return adminService.deleteDepartment(id);
	}
	@RequestMapping(value="/fetch/notices",method=RequestMethod.GET,produces="application/json")
	public List<Notices> getNotices(){
		List<Notices> list=adminService.getNotices();
		return list;
	}
	
	
	@RequestMapping(value="/load/noticebar")		
   public ModelAndView getNoticeBar(){
		return new ModelAndView("admin/noticebar");
	}
}
