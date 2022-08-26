package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {

    public Long getId();

    public String getName();

    public Category getCategory();

    public Attachment getPhoto();

    public String getCode();

    public Measurement getMeasurement();

    public boolean isActive();

    public TechnicalСharacteristics getTechnicalСharacteristics();

    public Brend getBrend();


}
