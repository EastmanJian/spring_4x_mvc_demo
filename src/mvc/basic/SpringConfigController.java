package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/viewSpringConfig.do")
public class SpringConfigController {
    @RequestMapping(method = RequestMethod.GET)
    public String viewXml() {
        return "springConfig";
    }
}