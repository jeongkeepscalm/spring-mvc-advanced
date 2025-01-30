package study.about.springadvanced.advanced.trace.logtrace;

import study.about.springadvanced.advanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);

}
