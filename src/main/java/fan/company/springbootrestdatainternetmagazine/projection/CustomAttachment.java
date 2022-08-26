package fan.company.springbootrestdatainternetmagazine.projection;

import org.springframework.data.rest.core.config.Projection;


@Projection(types = fan.company.springbootrestdatainternetmagazine.entity.Attachment.class)
public interface CustomAttachment {

    public Long getId();

    public String getName();

    public double getSize();

    public String getContentType();

}
