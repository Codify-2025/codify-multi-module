package Codify.dto.response.all;


import Codify.dto.response.StudentResponseDto;

import java.util.List;

public record DashboardAllResponseDto
        (List<StudentResponseDto> nodes, List<AccumulateResponseDto> edges) {}
