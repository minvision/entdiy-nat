package com.entdiy.nat.common.model;

import lombok.Data;

@Data
public class Tunnel {
    private String name;
    private String subDomain;
    private String proto;
    private String host;
    private Integer port;
    private String schema;
    private Integer remotePort;

    //运行属性，无需配置
    private String clientToken;
}