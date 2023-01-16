

public class Main {

    public static void main(String[] args) {
        URLParser webPage = new URLParser();

        String url = "https://www.samplewebsite.com/sample-page/1";


        String protocol = webPage.getProtocol(url);
        System.out.println("The protocol = " + protocol);

        String hostName = webPage.getHostname(url);
        System.out.println("The hostname = " + hostName);

        String path = webPage.getPath(url);
        System.out.println("The path = " + path);

    }

}
