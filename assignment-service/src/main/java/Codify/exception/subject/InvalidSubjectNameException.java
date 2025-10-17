package Codify.exception.subject;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class InvalidSubjectNameException extends BaseException {
    public InvalidSubjectNameException() {
        super(ErrorCode.EMPTY_SUBJECT_NAME);
    }
}
