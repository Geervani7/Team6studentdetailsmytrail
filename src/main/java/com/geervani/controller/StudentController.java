package com.geervani.controller;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.geervani.accessingdatamysql.Student;
import com.geervani.accessingdatamysql.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@PostMapping("/studentdetails")
	public String Stddetails(@RequestParam(name = "stdid", required = true) int stdid,  Model model) {

        List<Student> studentlist= studentRepository.findAllByStdid(stdid);
        System.out.println("print the name:"+ studentlist.size());
		model.addAttribute("studentDetails", studentRepository.findAllByStdid(stdid));

		return "viewdetails";
		
	
}
	
	 
}