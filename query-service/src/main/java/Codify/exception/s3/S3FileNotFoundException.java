package Codify.exception.s3;

import Codify.exception.ErrorCode;
import Codify.exception.baseException.BaseException;

public class S3FileNotFoundException extends BaseException {
    public S3FileNotFoundException() {
        super(ErrorCode.S3_FILE_NOT_FOUND);
    }
}
