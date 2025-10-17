package Codify.exception.subject;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class SubjectAlreadyExistsException extends BaseException {
    public SubjectAlreadyExistsException() {
        super(ErrorCode.SUBJECT_ALREADY_EXISTS);
    }
}
