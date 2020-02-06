package sr.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sr.model.Staff;
import sr.repository.StaffRepository;
import sr.service.StaffService;

@Controller
public class StaffController {
	@RequestMapping("/home")
//	@RequestMapping(value = "/addStaff", method = RequestMethod.POST)
	public ModelAndView saveStaff() throws ParseException  {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
		StaffService staffservice = (StaffService) context.getBean("staffservice");	
//		staffservice.save(s);
		Staff staff = new Staff();
		staff.setName("Aye Aye");
		staff.setPhone("095562455");
		staff.setAddress("Bago");
		staff.setFathername("Uu");
		String date = "January 10,1995";
		DateFormat df = new SimpleDateFormat("MMMM d,yyyy");
		Date dob = df.parse(date);
		staff.setDob(dob);
		System.out.println(dob);
		Set<Staff> savestaff= new HashSet<Staff>();
		savestaff.add(staff);
		staffservice.saveAll(savestaff);
		ModelAndView view = new ModelAndView("/home");
		return view;
	}
	
//	for new form
	@RequestMapping(value = "/newStaff", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        Staff staff = new Staff();
        model.addObject("staff", staff);
        model.setViewName("staffform");
        return model;
    }
	
	@RequestMapping("/staffview")
	public ModelAndView staffList() {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
		StaffService staffservice = (StaffService) context.getBean("staffservice");
		List<Staff> listStaff = staffservice.findAll();
		ModelAndView view = new ModelAndView("/staffview");
		view.addObject("listStaff", listStaff);
		return view;
	}
	 
	
//	@RequestMapping(value = "/save" , method = RequestMethod.POST)
//	public String save(@ModelAttribute("staff") Staff staff) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
//		StaffService staffservice = (StaffService) context.getBean("staffservice");
//		staffservice.save(staff);
//		return "redirect:/staffview";
//	}
	
//	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("employee")Employee employee, 
//      BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getContactNumber());
//        model.addAttribute("id", employee.getId());
//        return "employeeView";
//    }
	
//	@RequestMapping(value = "/addStaff" , method = RequestMethod.POST)
//	public String submit(@ModelAttribute("staff") Staff staff , BindingResult result , ModelMap model) {
//		if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", staff.getName());
//        model.addAttribute("phone", staff.getPhone());
//        model.addAttribute("fathername", staff.getFathername());
//        model.addAttribute("dob", staff.getDob());
//        model.addAttribute("address", staff.getAddress());
//        return "redirect:/staffview";
//	}
	
	@RequestMapping(value = "/addStaff", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Staff staff) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
		StaffService staffservice = (StaffService) context.getBean("staffservice");
		Staff s = new Staff();
		Set<Staff> savestaff= new HashSet<Staff>();
		savestaff.add(s);
		staffservice.saveAll(savestaff);
		ModelAndView view = new ModelAndView("/home");
		return view;
    }
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id , Model model) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
		StaffService staffservice = (StaffService) context.getBean("staffservice");
		staffservice.deleteById(id);
		ModelAndView view = new ModelAndView("/home");
		return view;
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(@RequestParam("id") int id , Model model) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Lenovo/eclipse-workspace/CRUD-Webproject/src/main/resources/SpringConfig.xml");
		StaffService staffservice = (StaffService) context.getBean("staffservice");
		Optional<Staff> staff =staffservice.findById(id);
		ModelAndView view = new ModelAndView("/detail");
		view.addObject("listStaff",staff);
		return view;
	}
	
	
}
