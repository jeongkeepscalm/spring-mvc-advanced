package study.about.springadvanced.advanced.trace;

public class TraceStatus {

    private TraceId traceId;    // 트랜잭션 ID, Level
    private Long startTimeMs;   // 로그 시작 시간: 전체 수행 시간을 구하기 위한다.
    private String message;     // 시작시 사용한 메시지

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

}
