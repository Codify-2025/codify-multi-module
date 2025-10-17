package Codify.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubjectResponseDto {
    private Long subjectId;
    private String subjectName;
}
