package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Output;
import fan.company.springbootrestdatainternetmagazine.entity.OutputProduct;
import fan.company.springbootrestdatainternetmagazine.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    public Long getId();

    public Product getProduct();

    public double getAmount();

    public double getPrice();

    public Output getOutput();

}
