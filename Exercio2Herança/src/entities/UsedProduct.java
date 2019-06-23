package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) throws ParseException {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return name
                +" (used) $ "
                +price
                +" (Manufacture date: "
                +sdf1.format(manufactureDate)
                +")";
    }

}
