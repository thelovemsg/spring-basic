package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities._my_code;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doJob() {
        Request request = new Request("한번 테스트를 해보자앙");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LogRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doJob();
    }

}
