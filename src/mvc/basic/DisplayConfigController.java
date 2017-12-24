package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DisplayConfigController {
    @RequestMapping(value = "/viewSpringConfig.do", method = RequestMethod.GET)
    public String viewSpringConfigXml() {
        return "springConfig";
    }

    @RequestMapping(value = "/viewWebXml.do", method = RequestMethod.GET)
    public String viewWebXml() {
        return "webXml";
    }
}
