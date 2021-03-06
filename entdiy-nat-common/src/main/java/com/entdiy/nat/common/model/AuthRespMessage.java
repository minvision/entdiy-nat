/**
 * Copyright @ 2020-2020 EntDIY-NAT (like Ngrok) based on Netty
 *
 * Author: Li Xia, E-Mail: xautlx@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.entdiy.nat.common.model;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString(callSuper=true)
public class AuthRespMessage extends BaseResponseMessage {
    private String version;
    private String mmVersion;
    private String clientToken;

    /**
     * 服务端配置的穿透通道定义，可选属性
     */
    private Map<String, Tunnel> tunnels;
}
