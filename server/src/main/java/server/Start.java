package server;

import static server.Database.connect;
import static server.Database.disconnect;

public class Start{
    public static void main(String[] args) {
        new Server();
        try {
            connect();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }
}
