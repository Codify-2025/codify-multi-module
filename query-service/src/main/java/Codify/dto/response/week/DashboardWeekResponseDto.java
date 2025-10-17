package Codify.dto.response.week;

import Codify.dto.response.StudentResponseDto;

import java.util.List;

public record DashboardWeekResponseDto(List<StudentResponseDto> nodes, List<WeekDataDto> edges)
{}
