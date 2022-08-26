package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.projection.CustomFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "feedback", collectionResourceRel = "list", excerptProjection = CustomFeedback.class)
public interface FeedbackRepository extends JpaRepository<Users, Long> {
}
