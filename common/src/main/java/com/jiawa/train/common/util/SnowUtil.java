package com.jiawa.train.common.util;

import cn.hutool.core.util.IdUtil;

public class SnowUtil {

    private static long daraCenterId = 1;
    private static long workerId = 1;

    public static long getSnowflakeNextId() {
        return IdUtil.getSnowflake(workerId, daraCenterId).nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return IdUtil.getSnowflake(workerId, daraCenterId).nextIdStr();
    }
}
