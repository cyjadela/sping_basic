package hello.core.order;

public interface OrderService {
    //주문 관련 정보 반환
    Order createOrder(Long memberId,String itemName, int itemPrice);
}
