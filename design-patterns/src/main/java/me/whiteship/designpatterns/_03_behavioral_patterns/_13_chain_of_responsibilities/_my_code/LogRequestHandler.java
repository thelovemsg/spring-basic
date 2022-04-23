package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._my_code;

public class LogRequestHandler extends RequestHandler{

    public LogRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
