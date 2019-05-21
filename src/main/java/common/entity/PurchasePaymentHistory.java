package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "purchase_payment_history")
public class PurchasePaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchase_payment_history_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    private int purchase_history_paid;

    @Builder
    public PurchasePaymentHistory (int company_id, int product_id, int purchase_history_paid) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.purchase_history_paid = purchase_history_paid;
    }
}

