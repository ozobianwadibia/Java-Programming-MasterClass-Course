

public class URLParser {

    /*
     * Gets the protocol of an url
     *
     * @param url the url as a String
     * @return the protocol part of the url
     * */
    public String getProtocol(String url) {
        int idx = 0;
        int idx2 = url.indexOf(":");
        return (url.substring(idx, idx2));
    }

    /*
     * Gets the hostname of an url
     *
     * @param url the url as a String
     * @return the hostname part of the url
     * */
    public String getHostname(String url) {
        int idx3 = url.indexOf(".com/");
        String hostname = url.substring(getProtocol(url).length() + 3, idx3);
        return hostname.concat(".com");

    }

    /*
     * Gets the path of an url
     *
     * @param url the url as a String
     * @return the path part of the url
     * */
    public String getPath(String url) {
        int previous = getProtocol(url).length() + 3 + getHostname(url).length() + 1;
        return url.substring(previous);
    }

}
