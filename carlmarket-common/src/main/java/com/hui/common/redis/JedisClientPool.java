package com.hui.common.redis;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

//访问单机版redis的实现类
public class JedisClientPool implements JedisClient {

	private JedisPool jedisPool;	
	
	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String v = jedis.set(key, value);
		jedis.close();
		return v;
	}

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String v = jedis.get(key);
		jedis.close();
		return v;
	}

	@Override
	public Long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.del(key);
		jedis.close();
		return v;
	}

	@Override
	public Boolean exists(String key) {
		Jedis jedis = jedisPool.getResource();
		Boolean v = jedis.exists(key);
		jedis.close();
		return v;
	}

	@Override
	public Long hset(String key, String field, String value) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.hset(key, field, value);
		jedis.close();
		return v;
	}

	@Override
	public String hget(String key, String field) {
		Jedis jedis = jedisPool.getResource();
		String v = jedis.hget(key, field);
		jedis.close();
		return v;
	}

	@Override
	public Long hdel(String key, String... field) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.hdel(key, field);
		jedis.close();
		return v;
	}

	@Override
	public Boolean hexists(String key, String field) {
		Jedis jedis = jedisPool.getResource();
		Boolean hexists = jedis.hexists(key, field);
		jedis.close();
		return hexists;
	}

	@Override
	public Long expire(String key, int seconds) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.expire(key, seconds);
		jedis.close();
		return v;
	}

	@Override
	public Long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.ttl(key);
		jedis.close();
		return v;
	}

	@Override
	public Long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long v = jedis.incr(key);
		return v;
	}

	@Override
	public List<String> hvals(String key) {
		Jedis jedis = jedisPool.getResource();
		List<String> v = jedis.hvals(key);
		return v;
	}
	

}