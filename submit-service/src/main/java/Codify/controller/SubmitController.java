package Codify.controller;


import Codify.dto.SubmissionDto;
import Codify.service.SubmitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/upload")
public class SubmitController {
    private final SubmitService submitService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SubmissionDto submissiondto) {
        submitService.saveUpload(submissiondto);
        return ResponseEntity.ok().build();
    }
}
