package Models;

import java.io.IOException;

public class ApiConnectorJsonProcessor {

    Connection connection = new Connection();

    public void boot(String value,double mount) throws IOException, InterruptedException {
        String body = connection.connectionApi(value,mount);
        FromJson fromJson = new FromJson(body,mount);
        fromJson.json();
    }
}
