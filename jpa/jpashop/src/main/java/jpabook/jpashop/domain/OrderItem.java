package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

//    @Column(name = "ORDER_ID")
//    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

//    @Column(name = "ITEM_ID")
//    private Long itemId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item_ item;

    private int orderPrice;
    private int count;

}
