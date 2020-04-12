package problemSet;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 题库
 * 146. LRU缓存机制
 * medium
 *
 * https://leetcode-cn.com/problems/lru-cache/
 *
 * https://leetcode-cn.com/submissions/detail/62022294/
 */
class LRUCache {
    private final int cacheMaxCapacity;
    private final LinkedHashMap<Integer,Integer> cacheMap;
    public LRUCache(int capacity) {
        this.cacheMaxCapacity = capacity;
        cacheMap = new LinkedHashMap<>();
    }

    public int get(int key) {
        return cacheMap.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cacheMap.remove(key);
        if (cacheMap.size() >= cacheMaxCapacity) {
            Iterator<Map.Entry<Integer,Integer>> iterator = cacheMap.entrySet().iterator();
            cacheMap.remove(iterator.next().getKey());
        }
        cacheMap.put(key, value);
    }


    public static void main(String[] args) {
//        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
//
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // 返回  1
//        cache.put(3, 3);    // 该操作会使得密钥 2 作废
//        cache.get(2);       // 返回 -1 (未找到)
//        cache.put(4, 4);    // 该操作会使得密钥 1 作废
//        cache.get(1);       // 返回 -1 (未找到)
//        cache.get(3);       // 返回  3
//        cache.get(4);       // 返回  4

        LRUCache cache1 = new LRUCache(1);
        cache1.put(2,1);
        System.out.println(cache1.get(1));
    }
}