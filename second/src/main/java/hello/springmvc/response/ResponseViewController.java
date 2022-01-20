package hello.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello?!");
        return mav;
    }

    //@ResponseBody => 바디에 데이터 반환.
    //@Controller 에서 String을 반환하면 view의 논리적인 이름이 된다.
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        model.addAttribute("data", "hello v2");
        return "response/hello";
    }

    //경로 이름과 반환하는 view의 논리적인 이름이 똑같으면 명시 안해줘도 v2와 같음
    //message converter 작동 => 권장 X
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){
        model.addAttribute("data", "hello v3");
    }

}
