package com.example.netty.netty_in_action.chapter9;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019-05-13 23:19
 * @description:
 */
public class FixedLengthFrameDecoder extends ByteToMessageDecoder {

    private final int frameLength;

    public FixedLengthFrameDecoder(int frameLength) {

        if (frameLength <= 0) {
            throw new IllegalArgumentException("frameLength must be a postive integer: " + frameLength);
        }
        this.frameLength = frameLength;
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        while (byteBuf.readableBytes() >= frameLength) {
            ByteBuf buf = byteBuf.readBytes(frameLength);
            list.add(buf);
        }
    }
}
