package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Client;
import fan.company.springbootrestdatainternetmagazine.entity.Currency;
import fan.company.springbootrestdatainternetmagazine.entity.Output;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {

    public Long getId();

    public Date getDate();

    public WareHouse getWarehouse();

    public Client getClient();

    public Currency getCurrency();

    public String getFactureNumber();

    public String getCode();

}
