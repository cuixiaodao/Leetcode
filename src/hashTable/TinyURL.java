package hashTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuixiaodao on 11/26/2017
 * for leetCode problem:
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 */

public class TinyURL{
    List<String> urls = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int i = Integer.valueOf(shortUrl);
        return i < urls.size() ? urls.get(i):"";
    }
}