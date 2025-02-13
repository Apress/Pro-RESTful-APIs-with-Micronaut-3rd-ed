package com.rest.domain;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import io.micronaut.serde.annotation.Serdeable;

@Schema(description="Quote")
@Entity
@Serdeable
public class Quote {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="ID")
 private Long id;

 @Column(name="CUSTOMER_ID")
 private Long customerId;

 @Column(name="QUOTE_DATE")
 @Size(max = 50)
 private String quoteDate;;

 @Column(name="BILLING_ADDRESS")
 @Size(max = 20)
 private String billingAddress;

 @Column(name="BILLING_CITY")
 @Size(max = 20)
 private String billingCity;;
 
 @Column(name="BILLING_STATE")
 @Size(max = 20)
 private String billingState;;

 @Column(name="BILLING_COUNTRY")
 @Size(max = 20)
 private String billingCountry;;

 @Column(name="BILLING_POSTAL_CODE")
 @Size(max = 20)
 private String billingPostalCode;;

 @Column(name="TOTAL")
 @Size(max = 20)
 private float total;


@OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinTable(name = "Quote_Line_Mapping",
joinColumns = @JoinColumn(name = "quote_id"),
inverseJoinColumns = @JoinColumn(name = "id"))
private List<QuoteLine> quoteLines;

public void setQuoteLines(List<QuoteLine> quoteLines) {
    this.quoteLines = quoteLines;
}

public List<QuoteLine> getQuoteLines() {
    return quoteLines;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}


public Long getCustomerId() {
    return customerId;
}

public void setCustomerId(Long customerId) {
    this.customerId = customerId;
}

public String getQuoteDate() {
    return quoteDate;
}

public void setQuoteDate(String quoteDate) {
    this.quoteDate = quoteDate;
}

public String getBillingAddress() {
    return billingAddress;
}

public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
}

public String getBillingCity() {
    return billingCity;
}

public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
}

public String getBillingState() {
    return billingState;
}

public void setBillingState(String billingState) {
    this.billingState = billingState;
}

public String getBillingCountry() {
    return billingCountry;
}

public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
}

public String getBillingPostalCode() {
    return billingPostalCode;
}

public void setBillingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
}

public float getTotal() {
    return total;
}

public void setTotal(float total) {
    this.total = total;
};

}
