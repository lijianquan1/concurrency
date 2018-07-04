package com.lee.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Author:ljq
 * Date: 2018/5/21
 **/
public class RedisUtil {

    private JedisPool pool = null;

    public void getJedisPool() {
        if (this.pool == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(1024);
            config.setMaxIdle(5);
            config.setMaxWaitMillis(1000 * 100);
            config.setTestOnBorrow(true);
            this.pool = new JedisPool(config, "127.0.0.1", 6379);
        }
    }

    public Jedis getInstance() {
        return this.pool.getResource();
    }
}
