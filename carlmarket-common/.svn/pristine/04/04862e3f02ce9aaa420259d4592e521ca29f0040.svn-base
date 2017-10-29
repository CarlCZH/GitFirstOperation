package com.hui.common.redis;

import java.util.List;

import redis.clients.jedis.JedisCluster;

//访问redis集群的实现类
public class JedisClientCluster implements JedisClient {
	
	private JedisCluster jedisCluster;
	

	public JedisCluster getJedisCluster() {
		return jedisCluster;
	}

	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	@Override
	public String set(String key, String value) {
		String v = jedisCluster.set(key, value);
		return v;
	}

	@Override
	public String get(String key) {
		String v = jedisCluster.get(key);
		return v;
	}

	@Override
	public Long del(String key) {
		Long v = jedisCluster.del(key);
		return v;
	}

	@Override
	public Boolean exists(String key) {
		Boolean v = jedisCluster.exists(key);
		return v;
	}

	@Override
	public Long hset(String key, String field, String value) {
		Long v = jedisCluster.hset(key, field, value);
		return v;
	}

	@Override
	public String hget(String key, String field) {
		String v = jedisCluster.hget(key, field);
		return v;
	}

	@Override
	public Long hdel(String key, String... field) {
		Long v = jedisCluster.hdel(key, field);
		return v;
	}

	@Override
	public Boolean hexists(String key, String field) {
		Boolean v = jedisCluster.hexists(key, field);
		return v;
	}

	@Override
	public Long expire(String key, int seconds) {
		Long v = jedisCluster.expire(key, seconds);
		return v;
	}

	@Override
	public Long ttl(String key) {
		Long v = jedisCluster.ttl(key);
		return v;
	}

	@Override
	public Long incr(String key) {
		Long v = jedisCluster.incr(key);
		return v;
	}

	@Override
	public List<String> hvals(String key) {
		List<String> v = jedisCluster.hvals(key);
		return v;
	}


}
