package Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FromJson {

    String body;
    double mount;

    public FromJson(String body, double mount){
        this.body = body;
        this.mount = mount;
    }

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void json(){
        CurrencyOmdb currencyOmdb = gson.fromJson(this.body, CurrencyOmdb.class);
        Currency currency = new Currency(currencyOmdb);
        currency.setAmount(this.mount);
        System.out.println(currency);
    };
}
