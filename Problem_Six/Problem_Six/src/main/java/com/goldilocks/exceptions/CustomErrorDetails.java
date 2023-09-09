package com.goldilocks.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorDetails {

	private LocalDateTime localdateTime;
	private String Message;
	private String Description;
	
}
