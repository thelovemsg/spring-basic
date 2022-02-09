package hello.proxy.pureproxy.proxy.trace.logtrace;

import hello.proxy.pureproxy.proxy.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
