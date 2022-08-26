package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {

    public Long getId();

    public String getName();

    public boolean isActive();

    public double getSumNow();

    public double getRublNow();

    public double getDollarNow();

}
