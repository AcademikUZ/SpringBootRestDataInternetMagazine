package fan.company.springbootrestdatainternetmagazine.repository;


import fan.company.springbootrestdatainternetmagazine.entity.Output;
import fan.company.springbootrestdatainternetmagazine.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "list", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
    Output findTopByOrderByIdDesc();
}
