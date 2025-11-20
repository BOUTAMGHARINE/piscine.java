import java.util.*;
import java.net.*;


public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        // Implementation to parse and validate URLs using regex
        Map<String,String> res = new HashMap<>();

        try {
            URL r = new URL(url);

            String pro = r.getProtocol();
            if (pro != null){
                res.put("protocol",pro);
            }
            String d = r.getHost();
            if (d!=null){
                res.put("domain",d);
            }
            int p = r.getPort();
            if (p != -1){
                res.put("port",p+"");
            }
            String pa = r.getPath();
            if(pa != null){
                res.put("path",pa == "" ? "/" : pa);
            }
            String q = r.getQuery();
            if (q != null){
                res.put("query",q);
            }
            return res;
        }catch(Exception e){
            return res;
        }
    }
}

/* URL r = new URL(url);
            String protocol = r.getProtocol();
            if (protocol != null){
                result.put("protocol", protocol);
            }

            String host = r.getHost();
            if (host != null){
                result.put("domain", host);
            }

            int port = r.getPort();
            if (port != -1){
                result.put("port", String.valueOf(port));
            }

            String path = r.getPath();
            if (path != null){
                result.put("path", path == "" ? "/" : path);
            }

            String query = r.getQuery();
            if (query != null){
                result.put("query", query);
            }
 */