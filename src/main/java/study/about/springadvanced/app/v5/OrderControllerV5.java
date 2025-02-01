package study.about.springadvanced.app.v5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.about.springadvanced.advanced.trace.callback.TraceTemplate;
import study.about.springadvanced.advanced.trace.logtrace.LogTrace;

@RestController
public class OrderControllerV5 {

    private final OrderServiceV5 orderService;
    private final TraceTemplate template;

    public OrderControllerV5(OrderServiceV5 orderService, LogTrace trace) {
        this.orderService = orderService;
        this.template = new TraceTemplate(trace);
    }

    @GetMapping("/v5/request")
    public String request(String itemId) {

        return template.execute("OrderController.request()", () -> {
           orderService.orderItem(itemId);
            return "ok";
        });

        /*
            익명 내부 클래스

            return template.execute("OrderController.request()", new TraceCallback<String>() {
                @Override
                public String call() {
                    orderService.orderItem(itemId);
                    return "ok";
                }
            });
        */
    }
}
