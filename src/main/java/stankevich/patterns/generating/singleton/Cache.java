package stankevich.patterns.generating.singleton;

import java.util.HashMap;
import java.util.Map;

public final class Cache {

    private final Map<String, String> cacheRepository = new HashMap<>();

    private Cache() {
        System.out.println("Singleton created");
    }

    private static class Holder {
        static final Cache INSTANCE = new Cache();
    }

    public static Cache getCache() {
        return Holder.INSTANCE;
    }

    public String addToCache(String key, String value) {
        return cacheRepository.put(key, value);
    }

    public String getFromCache(String key) {
        return cacheRepository.get(key);
    }
}
