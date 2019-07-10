package com.capegemini.exercise.api.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MathUtilErrorCode {

	NOT_IMPLEMENTED_ERROR ("MUEC0001"),
	INTERNAL_ERROR ("MUEC0002"),
	INVALID_INPUT ("MUEC0003"),
	INVALID_LENGTH ("MUEC0004");
	
	private final String code;
	
}