package Codify.dto;

//데이터 전달만 담당 -> record로 선언
public record CodeDto(String code, Integer assignmentId, Integer submissionId, Integer studentId) {
}