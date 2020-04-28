package org.ajgroup.boot.controller;

import java.util.List;
import java.util.Optional;

import org.ajgroup.boot.entity.Student;
import org.ajgroup.boot.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@Autowired
	StudentRepo sr;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		List<Student> students = (List<Student>) sr.findAll();
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
		Optional<Student> s = sr.findById(id);
		Student st = s.get();
		mv.addObject("s", st);
		return mv;
	}

	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student s) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sr.save(s);
		return mv;
	}

	@RequestMapping("/editStudent")
	public ModelAndView editStudent(@ModelAttribute Student s) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sr.save(s);
		return mv;
	}

	@RequestMapping("/dltStud")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		sr.deleteById(id);
		return mv;
	}

}