package Codify.dto.response.data;

import java.util.List;

public record DashboardDataDto(UserDataDto user,Integer testCount, List<SubjectDataDto> subjects) {
}
