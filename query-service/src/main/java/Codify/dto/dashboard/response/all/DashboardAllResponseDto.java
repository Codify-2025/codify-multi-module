package Codify.dto.dashboard.response.all;


import Codify.dto.dashboard.response.StudentResponseDto;

import java.util.List;

public record DashboardAllResponseDto
        (List<StudentResponseDto> nodes, List<AccumulateResponseDto> edges) {}
