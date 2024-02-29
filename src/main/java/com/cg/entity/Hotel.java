package com.cg.entity;







import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
@jakarta.persistence.Id
	private String Id;
	private String name;
	private String location;
	private String about;
	
 
}