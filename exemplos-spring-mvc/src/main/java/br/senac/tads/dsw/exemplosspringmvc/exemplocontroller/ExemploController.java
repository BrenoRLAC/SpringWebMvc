package br.senac.tads.dsw.exemplosspringmvc.exemplocontroller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo")
public class ExemploController {
	
//	
//	@GetMapping("/mensagem1")
//	public String saudar1(Model modelo) {
//		return "mensagem-view";
//	}
//	
	
	@GetMapping("/mensagem2")
	public ModelAndView saudar2() {
	return new ModelAndView("mensagem-view");
	}

	
	@GetMapping("/exemplo-request-param")
	public ModelAndView exemploRequestParam (
	@RequestParam(value = "param1str", required = true, defaultValue = 
	"valor") String param1,
	@RequestParam(value = "param2int", required = false, defaultValue = "99")
	int param2) {
	 ModelAndView resposta = new ModelAndView("view-exemplo");
	 return resposta;
	}
	
	@GetMapping("/exemplo-path-var/{param1str}/{param2int}")
	public ModelAndView exemploPathVariable (
	@PathVariable(value = "param1str", required = true) String param1,
	@PathVariable(value = "param2int", required = true) int param2) {
	 ModelAndView resposta = new ModelAndView("view-exemplo");
	 return resposta;
	}
	
	@GetMapping("/exemplo-view-obj")
	public ModelAndView exemploViewObj() {
	 ModelAndView mv = new ModelAndView("view-exemplo");
	 mv.addObject("texto", "Texto gerado no Controller v2");
	 mv.addObject("numero", 100);
	 mv.addObject("dataHora"
	, LocalDateTime.now());
	 return mv;
	}
	
	
	@GetMapping("/dados-pessoais")
	public ModelAndView dadosPessoais() {
	 ModelAndView mv = new ModelAndView("dados-pessoais");
	 mv.addObject("nome", "Breno Rodrigues Lemos");
	 mv.addObject("texto", "(11)999999-123");
	 mv.addObject("numeroTelefone", "breno@senacsp.edu.br");
	 mv.addObject("dataNascimento", "10/08/2001");
	 mv.addObject("linkedin", "linkedin.com/in/breno");
	 mv.addObject("gitHub", "github.com/user/in/breno");
	 return mv;
	}
	
	@GetMapping("/dados-pessoais-recriado")
	public ModelAndView dadosPessoaisRecriado() {
	 ModelAndView mv = new ModelAndView("dados-pessoais-recriado");
	 mv.addObject("nome", "Breno Rodrigues Lemos");
	 mv.addObject("texto", "(11)999999-123");
	 mv.addObject("numeroTelefone", "breno@senacsp.edu.br");
	 mv.addObject("dataNascimento", "10/08/2001");
	 mv.addObject("linkedin", "linkedin.com/in/breno");
	 mv.addObject("gitHub", "github.com/user/in/breno");
	 return mv;
	}
}
