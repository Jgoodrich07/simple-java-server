package httpserver.handler;

import httpserver.response.Response;
import httpserver.server.ClientSocketInterface;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ResponseHandler {
    public InputStream handle(Response response, ClientSocketInterface socket);

    void sendToClient(InputStream in, OutputStream outputStream, byte[] bytes) throws IOException;
}
