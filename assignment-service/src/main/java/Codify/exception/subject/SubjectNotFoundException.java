package Codify.exception.subject;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class SubjectNotFoundException extends BaseException {
    public SubjectNotFoundException() {
        super("존재하지 않는 과목입니다.", ErrorCode.NOT_FOUND);
    }
}
