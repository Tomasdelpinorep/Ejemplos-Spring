package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	private boolean done;
	private LocalDateTime limitDate;
	
}
