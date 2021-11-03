package org.fashionshop.fashionshop.customer.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Embeddable
public class CreditCard {
    @Column(name="card-type",nullable = false)
    private CreditCardType type;

    @Pattern(regexp="\\d{16}")
    @Column(name="card-number",nullable = false)
    private String cardNumber;

    @NotNull
    @Min(1)
    @Max(12)
    @Column(name="exp-month")
    private int expirationMonth;
    @NotNull
    @Min(2000)
    @Column(name="exp-year")
    private Integer expirationYear;

    private String code;

}
