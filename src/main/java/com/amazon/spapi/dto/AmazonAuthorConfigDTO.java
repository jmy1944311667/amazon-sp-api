package com.amazon.spapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 亚马逊请求参数dto
 */
@Data
@EqualsAndHashCode
public class AmazonAuthorConfigDTO {

    /**
     * AWS访问密钥编码
     */
    private String accessKeyId;
    /**
     * AWS访问密钥
     */
    private String secretKey;
    /**
     * 区域
     */
    private String region;
    /**
     * IAM职权ARN
     */
    private String roleArn;
    /**
     * IAM职权名称
     */
    private String roleSessionName;
    /**
     * LWA客户端编码
     */
    private String clientId;
    /**
     * LWA客户端秘钥
     */
    private String clientSecret;
    /**
     * LWA客户端令牌
     */
    private String refreshToken;
    /**
     * LWA授权服务器的节点地址
     */
    private String lwaEndpoint;
    /**
     * SP授权服务器节点地址
     */
    private String spEndPoint;
}
