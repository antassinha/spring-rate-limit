package com.test.ratelimit.API.service;

import io.github.bucket4j.Bucket;

public interface RateLimiterService {
  Bucket resolveBucket(String apiKey);
}
