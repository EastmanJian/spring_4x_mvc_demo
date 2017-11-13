package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller  //annotate this class is a controller
@RequestMapping("/hellospring.do") //Handler Mapping.
                                   //You can put "/helloworld" instead, omit ".do" which is already defined in web.xml.
                                   //URL "[hostname]:[port]//[module-name]/helloworld.do" will map to this controller.
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello, This is a demo of Spring MVC Framework!"); //model data
        return "hello"; //return the view name. according to the prefix and suffix config of
                        //InternalResourceViewResolver in HelloWeb-servlet.xml this maps to view "/jsp/hello.jsp"
    }
}