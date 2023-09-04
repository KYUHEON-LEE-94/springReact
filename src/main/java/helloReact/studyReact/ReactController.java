package helloReact.studyReact;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ReactController {
    @Controller
    public class WebController implements ErrorController {
        @GetMapping({"/", "/error"})
        public String index() {
            return "index.html";
        }
    }
}
