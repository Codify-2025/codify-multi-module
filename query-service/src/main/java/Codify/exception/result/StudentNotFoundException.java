package Codify.exception.result;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class StudentNotFoundException extends BaseException {
    public StudentNotFoundException() {
        super(ErrorCode.STUDENT_NOT_FOUND);
    }
}