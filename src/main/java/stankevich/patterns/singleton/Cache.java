package stankevich.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static Cache cache;
    private static final Map<String, String> cacheRepository = new HashMap<>();

    private Cache() {
    }

    public static synchronized Cache getCache() {
        if (cache == null) {
            cache = new Cache();
        }
        return cache;
    }

    public String addToCache(String key, String value) {
        return cacheRepository.put(key, value);
    }

    public String getFromCache(String key) {
        return cacheRepository.get(key);
    }
}
