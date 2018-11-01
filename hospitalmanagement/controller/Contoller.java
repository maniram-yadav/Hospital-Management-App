package org.hospital.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Contoller {
	
	@RequestMapping(value="/doctor",method=RequestMethod.POST,produces="application/json")
	public List<Map> addDoctor(){
	   
		Map<String, String> map=new HashMap<String,String>();
		if(true)
			map.put("msg" ,"Doctor successfully Registered");
		else
			map.put("msg","Something Error Occured");
	  
	   List<Map> list=new ArrayList<Map>();
		list.add(map);
	   return list; 
	}
	@RequestMapping(value="/doctor",method=RequestMethod.PUT,produces="application/json")
	public List<Map> updateDoctor(){
	   
		Map<String, String> map=new HashMap<String,String>();
		if(true)
			map.put("msg","Doctor successfully Registered");
		else
			map.put("msg","Something Error Occured");
	  
	   List<Map> list=new ArrayList<Map>();
		list.add(map);
	   return list; 
	}
	@RequestMapping(value="/doctor",method=RequestMethod.DELETE,produces="application/json")
	public List<Map> deleteDoctor(){
	   
		Map<String, String> map=new HashMap<String,String>();
		if(true)
			map.put("msg","Doctor successfully Registered");
		else
			map.put("msg","Something Error Occured");
	  
	   List<Map> list=new ArrayList<Map>();
		list.add(map);
	   return list; 
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/msg",method=RequestMethod.GET)
	public List<Map> getMsg(){
		
		List<Map> list=new ArrayList<Map>();
		Map<Object, Object> map=new HashMap<Object, Object>();
		map.put("name","Raju" );
		//list.add(map);
		map.put("age",20);
		//list.add(map);
		map.put("dob","20/10/2089");
		list.add(map);
		return list;
		
	}


	@RequestMapping(value="/home",method=RequestMethod.GET,produces="application/json")
	public ModelAndView home(){
		
		List<Map> list=new ArrayList<Map>();
		Map<Object, Object> map=new HashMap<Object, Object>();
		map.put("name","Raju" );
		//list.add(map);
		map.put("age",20);
		//list.add(map);
		map.put("dob","20/10/2089");
		list.add(map);
		return new ModelAndView("home","","");
		
	}

	@RequestMapping(value="/adminpage",method=RequestMethod.GET,produces="application/json")
	public ModelAndView AdminHome(){
		return new ModelAndView("admin/new","","");
		
	}

}