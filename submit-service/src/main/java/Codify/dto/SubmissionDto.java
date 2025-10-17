package Codify.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubmissionDto {
    private Long assignmentId;
    private String fileName;
    private Long week;
    private LocalDateTime submissionDate;
    private Long studentId;
    private String studentName;
    private String s3Key;
    private Boolean isLastFile;
}
