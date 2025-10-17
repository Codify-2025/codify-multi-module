package Codify.exception.user;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class UnauthenticatedException extends BaseException {
    public UnauthenticatedException() {
        super(ErrorCode.UNAUTHENTICATED);
    }
}
