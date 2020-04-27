package org.ajgroup.controller;

import java.util.List;

import org.ajgroup.entity.Student;
import org.ajgroup.studentDaoImpl.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@Autowired
	StudentDaoImpl sdt;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		List<Student> students = sdt.allStud();
		mv.addObject("stud", students);
		return mv;
	}
	
	@RequestMapping("/crtstudent")
	public ModelAndView crtstudentForm() {
		ModelAndView mv = new ModelAndView("newStudentForm");
		return mv;
	}

	@RequestMapping("/student")
	public ModelAndView studentForm(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("studentForm");
		Student s = sdt.getStud(id);
		mv.addObject("s", s);
		return mv;
	}

	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student s) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sdt.createStud(s);
		return mv;
	}

	@RequestMapping("/editStudent")
	public ModelAndView editStudent(@ModelAttribute Student s) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sdt.editStud(s);
		return mv;
	}

	@RequestMapping("/dltStud")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sdt.deleteStud(id);
		return mv;
	}
}