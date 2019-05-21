package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "purchase_payment")
public class PurchasePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchase_payment_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    private int purchase_total;

    @Column
    private int purchase_paid;

    @Builder
    public PurchasePayment (int company_id, int product_id, int purchase_total, int purchase_paid) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.purchase_total = purchase_total;
        this.purchase_paid = purchase_paid;
    }
}
