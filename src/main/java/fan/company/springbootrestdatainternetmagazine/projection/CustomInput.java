package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Currency;
import fan.company.springbootrestdatainternetmagazine.entity.Input;
import fan.company.springbootrestdatainternetmagazine.entity.Supplier;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {

    public Long getId();

    public Date getDate();

    public WareHouse getWarehouse();

    public Supplier getSupplier();

    public Currency getCurrency();

    public String getFactureNumber();

    public String getCode();
}
