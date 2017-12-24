package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @RequestMapping(value="/pageOne.do", method = RequestMethod.GET)
    public String printPage1Msg(ModelMap model) {
        model.addAttribute("message", "This is page ONE.");
        return "page";
    }

    @RequestMapping(value="/pageTwo.do", method = RequestMethod.GET)
    public String printPage2Msg(ModelMap model) {
        model.addAttribute("message", "This is page TWO.");
        return "page";
    }

    @RequestMapping(value="/pageThree.do", method = RequestMethod.GET)
    public String routeToPage3() {
        return "page3";
    }
}