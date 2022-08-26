package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.B2BClient;
import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = B2BClient.class)
public interface CustomB2BClient {

    public Long getId();

    public String getName();

    public String getPhoneNumber();

    public boolean isActive();

    public String getEmail();

    public String getSms();


}
