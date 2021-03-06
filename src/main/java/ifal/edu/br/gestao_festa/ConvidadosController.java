package ifal.edu.br.gestao_festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
    @Autowired
    private Convidados convidados;


    @GetMapping
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaConvidados");
        mv.addObject("convidados", convidados.findAll());
        mv.addObject(new Convidado());
        return mv;

    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }

}