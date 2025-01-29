package study.about.springadvanced.app.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.about.springadvanced.app.v0.OrderServiceV0;

@RestController
@RequiredArgsConstructor
public class OrderControllerV1 {

     private final OrderServiceV1 orderService;

    @GetMapping("/v1/request")
    public String request(String itemId) {
         orderService.orderItem(itemId);
        return "ok";
    }
}
