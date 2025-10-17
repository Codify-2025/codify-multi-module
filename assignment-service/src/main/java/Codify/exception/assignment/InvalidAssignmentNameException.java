package Codify.exception.assignment;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class InvalidAssignmentNameException extends BaseException {
    public InvalidAssignmentNameException() {
        super("과제명이 비어있습니다.", ErrorCode.INVALID_INPUT_VALUE);
    }
}
