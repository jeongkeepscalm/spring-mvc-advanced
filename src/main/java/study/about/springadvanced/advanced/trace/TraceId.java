package study.about.springadvanced.advanced.trace;

import java.util.UUID;

/*
    [796bccd9] OrderController.request()    //트랜잭션ID:796bccd9, level:0
    [796bccd9] |-->OrderService.orderItem() //트랜잭션ID:796bccd9, level:1
    [796bccd9] | |-->OrderRepository.save() //트랜잭션ID:796bccd9, level:2
 */

public class TraceId {

    private String id;
    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    public TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }

    private String createId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public TraceId createNextId() {
        // 트랜잭션 id 는 같고 레벨(깊이)만 하나 증가
        return new TraceId(id, level + 1);
    }

    public TraceId createPreviousId() {
        // 트랜잭션 id 는 같고 레벨(깊이)만 하나 감소
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }
    
    public int getLevel() {
        return level;
    }

}
