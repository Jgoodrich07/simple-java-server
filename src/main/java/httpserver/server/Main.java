package httpserver.server;

import httpserver.handler.requesthandler.HttpRequestHandler;
import httpserver.handler.responsehandler.HttpResponseHandler;
import httpserver.parser.HTTPParser;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Port Number Required");
            System.exit(1);
        }

        Integer portNumber = Integer.parseInt(args[0]);
        Server server = new Server(new RealServerListener(portNumber), new HttpService(new HttpRequestHandler(), new HTTPParser(), new HttpResponseHandler()));
        server.startServer();
    }

}