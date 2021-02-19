package in.edac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	UserRepository userRepository;

	
	@GetMapping("/")
	public ModelAndView registerView() {
		ModelAndView mv = new ModelAndView("register");
		
		return mv;
	}
	
	
	@PostMapping("/register")
	public ModelAndView createUser(User user) {
		userRepository.save(user);
		
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("q", "1");
		return mv;
	}
	
}
