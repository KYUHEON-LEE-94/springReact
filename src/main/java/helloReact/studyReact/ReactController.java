package helloReact.studyReact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ReactController {
    @GetMapping("/matching")
    public String Hello(){
        return "frontend/build/index.html";
    }
}
