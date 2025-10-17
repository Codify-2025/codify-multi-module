package Codify.dto.dashboard.response.week;

import Codify.dto.dashboard.response.StudentResponseDto;

import java.util.List;

public record DashboardWeekResponseDto(List<StudentResponseDto> nodes, List<WeekDataDto> edges)
{}
