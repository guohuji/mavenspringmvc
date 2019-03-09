package com.atguigu.crud.test;

import redis.clients.jedis.Jedis;

import java.util.*;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //System.out.println(jedis.ping());
        //keys
//        Set<String> keys = jedis.keys("*");
//        jedis.set("k1","v1");
//        jedis.set("k2","v2");
//        Iterator iterator = keys.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(jedis.exists("k2"));
//        System.out.println(jedis.ttl("k1"));

        //String
//        jedis.set("k1","v1");
//        System.out.println(jedis.get("k1"));
//        jedis.mset("str1","v1","str2","v2","str3","v3");
//        System.out.println(jedis.mget("str1","str2","str3"));
//        jedis.rpush("mylist1","1","2","3","4","5");
//        List<String> mylist1 = jedis.lrange("mylist1", 0, -1);
//        for (String s: mylist1) {
//            System.out.println(s);
//        }
        //set
//        jedis.sadd("myset","111");
//        jedis.sadd("myset","222");
//        jedis.sadd("myset","333");
//        Set<String> myset = jedis.smembers("myset");
//        Iterator iterator = myset.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(jedis.smembers("myset").size());
//        jedis.srem("myset","222");
//        System.out.println(jedis.smembers("myset").size());

        //hash
//        jedis.hset("hash1","username","guohuji");
//        System.out.println(jedis.hget("hash1","username"));
//        Map<String,String> map = new HashMap<>();
//        map.put("telphtone","10086");
//        map.put("address","atguigu");
//        map.put("email","abc@163.com");
//        jedis.hmset("hash2",map);
//        List<String> hmget = jedis.hmget("hash2", "telphtone",
//                "email", "address");
//        for(String s : hmget){
//            System.out.println(s);
//        }

        //zset
        jedis.zadd("zset01",60d,"v1");
        jedis.zadd("zset01",70d,"v2");
        jedis.zadd("zset01",80d,"v3");
        jedis.zadd("zset01",90d,"v4");
        Set<String> zset01 = jedis.zrange("zset01", 0, -1);
        Iterator iterator = zset01.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
