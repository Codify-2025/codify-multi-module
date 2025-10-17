package Codify.dto.result.topology;

import java.util.List;

public record TopologyResponseDto(
        List<TopologyNodeDto> nodes,
        List<TopologyEdgeDto> edges
) {}
