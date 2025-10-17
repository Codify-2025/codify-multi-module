package Codify.exception.databaseException;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class DatabaseException extends BaseException {
    public DatabaseException(String message) {
        super(ErrorCode.DATABASE_SAVE_ERROR);
    }
}
