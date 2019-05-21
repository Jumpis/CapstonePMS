package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchase_history_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    @CreationTimestamp
    private LocalDateTime purchase_date;

    @Column
    private int purchase_quantity;

    @Column
    private int purchase_price;

    @Column
    private String purchase_cancel;

    @Builder
    public PurchaseHistory (int company_id, int product_id, LocalDateTime purchase_date, int purchase_quantity, int purchase_price, String purchase_cancel) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.purchase_date = purchase_date;
        this.purchase_quantity = purchase_quantity;
        this.purchase_price = purchase_price;
        this.purchase_cancel = purchase_cancel;
    }
}
