package servlet.basic.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     * 0
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
