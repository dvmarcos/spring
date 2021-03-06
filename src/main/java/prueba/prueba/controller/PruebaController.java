package prueba.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prueba.prueba.entity.PruebaEntity;
import prueba.prueba.service.PruebaService;



@Controller
@RequestMapping("/")
public class PruebaController {
 
  @Autowired 
  private PruebaService pruebaService;
   
  /**
   * Requests to http://localhost:8080/hello will be mapped here.
   * Everytime invoked, we pass list of all persons to view
   */
  @RequestMapping(method = RequestMethod.GET)
  public String listAll(Model model) {
    model.addAttribute("pruebas", pruebaService.getAll());
    return "prueba";
  }
   
  /**
   * POST requests to http://localhost:8080/hello/addPerson goes here.
   * The new person data is passed from HTML from and bound into the
   * Person object.
   */
  @RequestMapping(value = "/addPrueba", method = RequestMethod.POST)
  public String addPrueba(@ModelAttribute PruebaEntity prueba) {
	
	  	pruebaService.add(prueba);
	
    return "redirect:/";
  }
}