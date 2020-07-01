package com.lpl.pig.study.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccessToken {
    /**
     * token
     */
    private String token;

    /**
     * 失效时间
     */
    private Date expireTime;
}
