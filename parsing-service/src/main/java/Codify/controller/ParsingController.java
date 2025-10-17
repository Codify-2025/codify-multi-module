package Codify.controller;

import Codify.dto.CodeDto;
import Codify.dto.ResultDto;
import Codify.service.ParsingService;
import Codify.service.S3Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/parse")
public class ParsingController {
    private final ParsingService parsingService;

    @PostMapping("/")
    public ResponseEntity<ResultDto> parsing(@RequestBody CodeDto codeDto) {
        return ResponseEntity.ok(parsingService.parsing(codeDto));
    }

}
