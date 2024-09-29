package ac.kr.koreatech.devops_step0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

  @Value("${secrets.SERVER_SSH_KEY}")
  private String key;

  @GetMapping("/")
  public String index() {
    return "index.html";
  }

  @GetMapping("/key")
  @ResponseBody
  public String getMethodName() {
      return key;
  }
  
}
