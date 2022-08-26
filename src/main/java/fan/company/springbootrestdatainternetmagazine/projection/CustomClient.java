package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {

    public Long getId();

    public String getName();

    public String getPhoneNumber();

    public boolean isActive();

}
