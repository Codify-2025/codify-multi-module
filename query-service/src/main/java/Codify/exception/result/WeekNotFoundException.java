package Codify.exception.result;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class WeekNotFoundException extends BaseException {
    public WeekNotFoundException() {
        super(ErrorCode.WEEK_NOT_FOUND);
    }
}
