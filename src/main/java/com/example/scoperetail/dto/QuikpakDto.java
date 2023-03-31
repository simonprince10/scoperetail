package com.example.scoperetail.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

@Getter
@Setter
@Data
@ToString
public class QuikpakDto {

    private Long id;

    private String empName;

    private String department;

    private String description;

    private String price;

    private String emailAddress;

}
