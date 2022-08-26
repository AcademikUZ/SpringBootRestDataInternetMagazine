package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Feedback;
import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = Feedback.class)
public interface CustomFeedback {

    public Long getId();

    public String getAuthorName();

    public String getFeedback();

}
