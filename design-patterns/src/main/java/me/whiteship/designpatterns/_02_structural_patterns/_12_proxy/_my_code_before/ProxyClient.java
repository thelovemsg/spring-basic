package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

public class ProxyClient {

    private Subject subject;

    public ProxyClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.doSubject();
    }

}