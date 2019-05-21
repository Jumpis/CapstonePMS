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
@Table(name = "sales_history")
public class SalesHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sales_history_id;

    @Column
    private int company_id;

    @Column
    private int product_id;

    @Column
    @CreationTimestamp
    private LocalDateTime sales_date;

    @Column
    private int sales_quantity;

    @Column
    private int sales_price;

    @Column
    private String sales_cancel;

    @Builder
    public SalesHistory (int company_id, int product_id, LocalDateTime sales_date, int sales_quantity, int sales_price, String sales_cancel) {
        this.company_id = company_id;
        this.product_id = product_id;
        this.sales_date = sales_date;
        this.sales_quantity = sales_quantity;
        this.sales_price = sales_price;
        this.sales_cancel = sales_cancel;
    }
}
