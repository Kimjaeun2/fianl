package com.trip.finalProject.sms;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SmsRequestDTO {
	private String type;
	private String contentType;
	private String countryCode;
	private String from;
	private String content;
	private List<MessageDTO> messages;
	private String randomNumber;
	
}