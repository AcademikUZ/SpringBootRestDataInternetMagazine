package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Input;
import fan.company.springbootrestdatainternetmagazine.entity.InputProduct;
import fan.company.springbootrestdatainternetmagazine.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    public Long getId();

    public Product getProduct();

    public double getAmount();

    public double getPrice();

    public Date getExpireDate();

    public Input getInput();

}
