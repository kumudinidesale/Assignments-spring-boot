package com.edureka.model2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Value("Kishlay Kishan")
	String name;
	@Value("1403")
	String id;
	@Autowired
	@Qualifier("hostel2")
	Hostel hostel;
	String currentCity;
}
