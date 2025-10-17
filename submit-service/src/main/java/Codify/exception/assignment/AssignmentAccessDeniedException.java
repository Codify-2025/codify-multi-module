package Codify.exception.assignment;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class AssignmentAccessDeniedException extends BaseException {
    public AssignmentAccessDeniedException() {
        super(ErrorCode.ASSIGNMENT_ACCESS_DENIED);
    }
}
