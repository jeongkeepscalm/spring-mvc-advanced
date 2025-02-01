package study.about.springadvanced.advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.about.springadvanced.advanced.trace.logtrace.LogTrace;
import study.about.springadvanced.advanced.trace.logtrace.ThreadLocalLogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        // return new FieldLogTrace();
        /*
            FieldLogTrace
                싱글톤으로 등록된 스프링 빈
                해당 객체의 인스턴스는 애플리케이션에 1개만 존재하게 된다. 
                해당 인스턴스를 여러 쓰레드가 동시에 접근할 경우 "동시성 문제 발생!"
         */

        /**
         * LogTrace 인터페이스의 구현체로 ThreadLocalLogTrace 를 사용하겠다.
         */
        return new ThreadLocalLogTrace();
    }

}
