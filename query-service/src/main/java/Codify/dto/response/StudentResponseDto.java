package Codify.dto.response;

import lombok.Builder;

//int vs Integer객체
//label -> studentName
public record StudentResponseDto(Long id, String label) {}
