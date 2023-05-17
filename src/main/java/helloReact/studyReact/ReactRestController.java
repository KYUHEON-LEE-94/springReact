package helloReact.studyReact;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class ReactRestController {
    @GetMapping("/rest")
    public List<String> Hello(){
        return Arrays.asList("서버 포트는 8080","리액트 포트는 3030");
    }

//    @PostMapping("/copy")
//    public String copied(@RequestBody Map<String, String> requestBody) {
//        String copiedText = requestBody.get("copiedText");
//        log.info("copiedText: {}", copiedText);
//        return copiedText;
//    }
}
