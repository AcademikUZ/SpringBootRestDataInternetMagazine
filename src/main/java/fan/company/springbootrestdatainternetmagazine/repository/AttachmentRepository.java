package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Attachment;
import fan.company.springbootrestdatainternetmagazine.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
