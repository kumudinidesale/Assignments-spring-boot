package com.edureka.model2;

import javax.annotation.Resource;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Employee {
	private String id;
    private String name;
 
    @Resource(name="mycompany")
    private Company company;
}
