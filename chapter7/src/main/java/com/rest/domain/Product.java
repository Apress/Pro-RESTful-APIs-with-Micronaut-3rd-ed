package com.rest.domain;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import javax.validation.constraints.Size;
import io.micronaut.serde.annotation.Serdeable;
@Schema(description="Product")
@Entity
@Serdeable
public class Product {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="ID")
 private Long id;

 @Column(name="NAME")
 @Size(max = 20)
 private String name;

 @Column(name="DESCRIPTION")
 @Size(max = 50)
 private String description;;

 @Column(name="CREATE_DATE")
 @Size(max = 40)
 private String createDate;;
 
 @Column(name="CHANGE_DATE")
 @Size(max = 40)
 private String changeDate;;

 @Column(name="UNIT_PRICE")
 @Size(max = 20)
 private float unitPrice;;

 @Column(name="CREATOR")
 private String creator;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getCreateDate() {
    return createDate;
}

public void setCreateDate(String createDate) {
    this.createDate = createDate;
}

public String getChangeDate() {
    return changeDate;
}

public void setChangeDate(String changeDate) {
    this.changeDate = changeDate;
}

public float getUnitPrice() {
    return unitPrice;
}

public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
}

public String getCreator() {
    return creator;
}

public void setCreator(String creator) {
    this.creator = creator;
};



}
