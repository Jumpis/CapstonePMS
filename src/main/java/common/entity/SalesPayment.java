package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "sales_payment")
public class SalesPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sales_payment_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    private int sales_total;

    @Column
    private int sales_paid;

    @Builder
    public SalesPayment (int company_id, int product_id, int sales_total, int sales_paid) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.sales_total = sales_total;
        this.sales_paid = sales_paid;
    }
}
