package com.kiran.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class products {
    private long id;
    public String title;
    private String description;
    private String price;
    private String imageUrl;
    private categories category;
}
