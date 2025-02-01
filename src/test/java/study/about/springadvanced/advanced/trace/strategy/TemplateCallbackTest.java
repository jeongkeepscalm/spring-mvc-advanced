package study.about.springadvanced.advanced.trace.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.about.springadvanced.advanced.trace.strategy.code.template.Callback;
import study.about.springadvanced.advanced.trace.strategy.code.template.TimeLogTemplate;

@Slf4j
public class TemplateCallbackTest {

    /**
     * 템플릿 콜백 패턴 - 익명 내부 클래스
     */

    @Test
    void callbackV1() {

        TimeLogTemplate template = new TimeLogTemplate();

        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("비지니스 로직 실행 1");
            }
        });

        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("비지니스 로직 실행 2");
            }
        });
    }

    /**
     * 람다
     */
    @Test
    void callbackV2() {
        TimeLogTemplate template = new TimeLogTemplate();

        template.execute(() -> {
            log.info("비지니스 로직 실행 1");
        });

        template.execute(() -> {
            log.info("비지니스 로직 실행 2");
        });
    }



}
