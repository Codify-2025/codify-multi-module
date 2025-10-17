package Codify.exception.result;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class InvalidWeekParameterException extends BaseException {
    public InvalidWeekParameterException() {
        super(ErrorCode.INVALID_WEEK_PARAMETER);
    }
}
