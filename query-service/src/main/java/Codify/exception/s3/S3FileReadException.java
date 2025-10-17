package Codify.exception.s3;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class S3FileReadException extends BaseException {
    public S3FileReadException() {
        super(ErrorCode.S3_FILE_READ_ERROR);
    }
}
