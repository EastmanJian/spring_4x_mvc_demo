package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pageOne.do")
public class Page1Controller {
    @RequestMapping(method = RequestMethod.GET)
    public String printMsg(ModelMap model) {
        model.addAttribute("message", "This is page ONE.");
        return "page";
    }
}