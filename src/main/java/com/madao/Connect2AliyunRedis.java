package com.madao;

import redis.clients.jedis.Jedis;

public class Connect2AliyunRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.117.68.144",6379);
        jedis.auth("123456");   //由于redis配置文件中修改了requirepass，此处需要添加密码
        System.out.println(jedis.ping());


    }
}
