package Codify.exception.result;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class ComparisonResultNotFoundException extends BaseException {
    public ComparisonResultNotFoundException() {
        super(ErrorCode.COMPARISON_RESULT_NOT_FOUND);
    }
}