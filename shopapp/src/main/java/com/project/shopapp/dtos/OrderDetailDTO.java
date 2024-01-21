package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message =  "Order's ID must be > 0")
    private Long orderID;

    @Min(value= 1 , message = "Product's ID must be > 0")
    @JsonProperty("product_id")
    private Long productID;

    @Min(value= 1 , message = "price must be >= 0")
    private Float price;

    @Min(value= 1 , message = "Number of products must be >= 1")
    @JsonProperty("number_of_products")
    private Long numberOfProducts;
    @JsonProperty("total_money")
    private Float totalMoney;
    private String color;

}
