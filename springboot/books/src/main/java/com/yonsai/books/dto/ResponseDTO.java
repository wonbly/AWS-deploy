package com.yonsai.books.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private int status;      // 200(성공), 500(실패) 등 상태 코드
    private String message;  // "성공하셨습니다", "오류 발생" 등 메시지
    private Object data;     // 실제 결과 데이터 (책 정보 등)
}