package com.example.advanced.trace;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class TraceStatus {
    private TraceId traceId;
    private Long startTimeMs;
    private String message;
}
