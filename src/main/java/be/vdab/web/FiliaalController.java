package be.vdab.web;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.services.FiliaalService;

@Controller
@RequestMapping("/filialen")
class FiliaalController {
	private static final String FILIALEN_VIEW = "filialen/filialen";
	private static final String TOEVOEGEN_VIEW = "filialen/toevoegen";
	private static final String REDIRECT_URL_NA_TOEVOEGEN = "redirect:/filialen";
	private static final Logger LOGGER =
		Logger.getLogger(FiliaalController.class.getName());
	private final FiliaalService filiaalService;
	private static final String FILIAAL_VIEW = "filialen/filiaal";
	
	FiliaalController(FiliaalService filiaalService) {
		this.filiaalService = filiaalService;
	}
	
	@GetMapping
	ModelAndView findAll() {
		return new ModelAndView(FILIALEN_VIEW, "filialen", filiaalService.findAll());
	}
	
	@GetMapping("toevoegen")
	String createForm() {
		return TOEVOEGEN_VIEW;
	}
	
	@PostMapping
	String create() {
		LOGGER.info("filiaal record toevoegen aan database");
		return REDIRECT_URL_NA_TOEVOEGEN;
	}
	
	@GetMapping("{id}")
	ModelAndView read(@PathVariable long id) {
		ModelAndView modelAndView = new ModelAndView(FILIAAL_VIEW);
		filiaalService.read(id)
			.ifPresent(filiaal -> modelAndView.addObject(filiaal));
		return modelAndView;
	}

}
