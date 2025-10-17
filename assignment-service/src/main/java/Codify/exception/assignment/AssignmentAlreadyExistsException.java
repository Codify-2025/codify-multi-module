package Codify.exception.assignment;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class AssignmentAlreadyExistsException extends BaseException {
    public AssignmentAlreadyExistsException() { super("이미 존재하는 과제명입니다.", ErrorCode.INVALID_INPUT_VALUE); }
}
