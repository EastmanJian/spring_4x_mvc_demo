package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/viewWebXml.do")
public class WebXmlController {
    @RequestMapping(method = RequestMethod.GET)
    public String viewXml() {
        return "webXml";
    }
}