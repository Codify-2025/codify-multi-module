package Codify.dto.result;

import Codify.dto.dashboard.response.StudentResponseDto;

import java.util.List;

public record ResultGraphDto(List<StudentResponseDto> nodes, FilterSummaryDto filterSummary, FilterPairsGroupDto filterPairs) {
}
