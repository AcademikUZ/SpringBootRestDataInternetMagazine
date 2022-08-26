package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = Users.class)
public interface CustomUser {

    public Long getId();

    public String getFirstName();

    public String getLastName();

    public String getPhoneNumber();

    public String getCode();

    public String getPassword();

    public boolean isActive();

    public Set<WareHouse> getWarehouses();

}
