package problemSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题库
 * 811. 子域名访问计数
 * Easy
 *
 * https://leetcode-cn.com/problems/subdomain-visit-count/
 *
 * https://leetcode-cn.com/submissions/detail/31640161/
 */

public class SubdomainVisitCount {

    public static void main(String[] args) {
        String[] test = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        new SubdomainVisitCount(test);
    }

    public SubdomainVisitCount(String[] domains) {
        System.out.println(subdomainVisits(domains));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        if (cpdomains == null) {
            return new ArrayList<>();
        }
        Map<String,Integer> countMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String domain : cpdomains){
            String[] countDomain = domain.split(" ");
            int count = Integer.parseInt(countDomain[0]);
            String d = countDomain[1];
            do {
                if (countMap.containsKey(d)) {
                    int value = countMap.get(d);
                    value += count;
                    countMap.put(d,value);
                }else{
                    countMap.put(d,count);
                }
                d = d.substring(d.indexOf(".")+1);
            }while (d.contains("."));
            if (countMap.containsKey(d)) {
                int value = countMap.get(d);
                value += count;
                countMap.put(d,value);
            }else{
                countMap.put(d,count);
            }

        }

        for (String domain:countMap.keySet()){
            result.add(countMap.get(domain)+" "+domain);
        }
        return result;
    }
}
