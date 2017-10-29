package com.hui.common.redis;

import java.util.List;

public interface JedisClient {
	
	//定义操作redis数据库的常用功能
	String set(String key,String value);
	String get(String key);
	Long del(String key);
	Boolean exists(String key);
	
	Long hset(String key,String field,String value);
	String hget(String key,String field);
	Long hdel(String key,String... field);
	Boolean hexists(String key,String field);
	List<String> hvals(String key);
	
	Long expire(String key,int seconds);
	Long ttl(String key);
    Long incr(String key);
}
