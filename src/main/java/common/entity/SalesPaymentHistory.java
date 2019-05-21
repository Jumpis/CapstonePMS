package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "sales_payment_history")
public class SalesPaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sales_payment_history_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    private int sales_history_paid;

    @Builder
    public SalesPaymentHistory (int company_id, int product_id, int sales_history_paid) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.sales_history_paid = sales_history_paid;
    }
}

