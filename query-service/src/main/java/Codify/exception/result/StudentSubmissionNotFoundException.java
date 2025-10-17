package Codify.exception.result;


import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class StudentSubmissionNotFoundException extends BaseException {
    public StudentSubmissionNotFoundException() {
        super(ErrorCode.STUDENT_SUBMISSION_NOT_FOUND);
    }
}
