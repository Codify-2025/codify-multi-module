package Codify.exception.result;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class SameStudentComparisonException extends BaseException {
    public SameStudentComparisonException() {
        super(ErrorCode.SAME_STUDENT_COMPARISON);
    }
}
