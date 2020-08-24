package com.sixj.nettypush.pubsub;

import io.netty.channel.Channel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sixiaojie
 * @date 2020-08-24-13:51
 */
@Data
public class NettyPushMessageBody implements Serializable {

    private String userId;

    private String message;
}
