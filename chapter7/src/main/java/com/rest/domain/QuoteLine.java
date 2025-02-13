package com.rest.domain;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import io.micronaut.serde.annotation.Serdeable;

@Schema(description="QuoteLine")
@Entity
@Serdeable
public class QuoteLine {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="ID")
 private Long id;

 @Column(name="QUOTE_ID")
 private Long quoteId;

 
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "product_id", referencedColumnName = "id")
private Product product;

 @Column(name="UNIT_PRICE")
 private float unitPrice;


 @Column(name="QUANTITY")
 private Long  quantity;


public Product getProduct() {
    return product;
}


public void setProduct(Product product) {
    this.product = product;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public Long getQuoteId() {
    return quoteId;
}


public void setQuoteId(Long quoteId) {
    this.quoteId = quoteId;
}


public float getUnitPrice() {
    return unitPrice;
}


public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
}


public Long getQuantity() {
    return quantity;
}


public void setQuantity(Long quantity) {
    this.quantity = quantity;
};
 
}
