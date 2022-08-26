package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.Attachment;
import fan.company.springbootrestdatainternetmagazine.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    public Long getId();

    public byte[] getBytes();

    public Attachment getAttachment();

}
