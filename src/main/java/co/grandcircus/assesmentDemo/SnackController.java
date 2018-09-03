package co.grandcircus.assesmentDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.assesmentDemo.dao.SnackDao;

@Controller
public class SnackController {

	@Autowired
	SnackDao snackDao;
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("list-snacks");
		mav.addObject("snack", snackDao.findAll());
		return mav;
	}
}
