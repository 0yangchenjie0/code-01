package com.bjpowernode.day17;

import java.util.UUID;

/**
 * 不重复的唯一标识
 * UUID 是通用唯一识别码 (Universally Unique Identifier) 的缩写，是一种软件构建的标准，其目的是让分布式系统中的所有元素，都能有
 * 唯一的辨识信息，不需要通过中央控制端来做辨识信息的指定。它由一组32位数的16进制数字所构成。
 */
public class UUIDDemo {
    public static void main(String[] args) {
//        while (true) {
//            System.out.println(UUID.randomUUID());
//        }

        while (true) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid.replace("-","").toUpperCase());

//            System.out.println(System.currentTimeMillis());
        }

    }
}
