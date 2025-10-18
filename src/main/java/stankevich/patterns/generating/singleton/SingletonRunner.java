package stankevich.patterns.generating.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        System.out.println("dsf");
        Cache.getCache().addToCache("один", "иван");
        Cache.getCache().addToCache("два", "петя");
        Cache.getCache().addToCache("три", "коля");

        var result = Cache.getCache().getFromCache("три");
        System.out.println(result);



        Logger.INSTANCE.log("Система запущена.");
    }
}
