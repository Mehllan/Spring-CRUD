package sr.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class RoleService {
	@RequestMapping("/")
	public ModelAndView welcomeMessage() {
		return null;
	}
}
