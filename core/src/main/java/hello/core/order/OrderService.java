package hello.core.order;

import hello.core.member.MemberRepository;

public interface OrderService {

        Order createOrder(Long memberId, String itemName, int itemPrice);

    //테스트용
        public MemberRepository getMemberRepository();

}
