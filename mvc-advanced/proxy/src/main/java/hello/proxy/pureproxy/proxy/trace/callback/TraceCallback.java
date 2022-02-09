package hello.proxy.pureproxy.proxy.trace.callback;

public interface TraceCallback<T> {
    T call();
}
