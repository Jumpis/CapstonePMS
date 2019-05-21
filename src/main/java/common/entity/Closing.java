package common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "closing")
public class Closing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int closing_id;

    @Column
    private int closing_year;

    @Column
    private int closing_month;

    @Column
    private int product_id;

    @Column
    private int closing_carryover;

    @Column
    private int closing_purchase;

    @Column
    private int closing_sales;

    @Column
    private int closing_present;

    @Column
    private String closing_status;

    @Builder
    public Closing (int closing_year, int closing_month, int product_id, int closing_carryover, int closing_purchase, int closing_sales, int closing_present, String closing_status) {
        this.closing_year = closing_year;
        this.closing_month = closing_month;
        this.product_id = product_id;
        this.closing_carryover = closing_carryover;
        this.closing_purchase = closing_purchase;
        this.closing_sales = closing_sales;
        this.closing_present = closing_present;
        this.closing_status = closing_status;
    }
}
