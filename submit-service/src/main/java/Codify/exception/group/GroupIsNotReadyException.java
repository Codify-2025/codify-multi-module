package Codify.exception.group;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class GroupIsNotReadyException extends BaseException {
    public GroupIsNotReadyException() {
        super(ErrorCode.GROUP_IS_NOT_READY);
    }
}
