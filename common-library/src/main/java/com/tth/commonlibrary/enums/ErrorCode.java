package com.tth.commonlibrary.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_EXISTED(1409, "Tài khoản đã tồn tại.", HttpStatus.CONFLICT),
    EMAIL_EXISTED(1409, "Địa chỉ email đã tồn tại.", HttpStatus.CONFLICT),
    USERNAME_EXISTED(1409, "Tên tài khoản đã tồn tại.", HttpStatus.CONFLICT),

    PASSWORD_INCORRECT(1400, "Mật khẩu không chính xác.", HttpStatus.BAD_REQUEST),

    UNAUTHENTICATED(2401, "Xác thực không thành công.", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(2403, "Bạn không có quyền truy cập tài nguyên này.", HttpStatus.FORBIDDEN),

    CANNOT_SEND_EMAIL(8001, "Không thể gửi email.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_REQUEST(9001, "Yêu cầu không hợp lệ.", HttpStatus.BAD_REQUEST),
    UNCATEGORIZED_ERROR(9999, "Lỗi không xác định.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;

    private final String message;

    private final HttpStatusCode httpStatusCode;

}
