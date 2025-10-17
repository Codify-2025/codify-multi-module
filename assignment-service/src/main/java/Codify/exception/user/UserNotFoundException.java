package Codify.exception.user;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class UserNotFoundException extends BaseException {
    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
