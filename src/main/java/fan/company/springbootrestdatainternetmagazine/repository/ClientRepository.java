package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Client;
import fan.company.springbootrestdatainternetmagazine.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
}
