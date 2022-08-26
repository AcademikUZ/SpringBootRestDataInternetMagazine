package fan.company.springbootrestdatainternetmagazine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Attachment photo;

    private String code;

    @ManyToOne
    private Measurement measurement;

    private boolean active;

    @ManyToOne
    private TechnicalСharacteristics technicalСharacteristics;

    @ManyToOne
    private Brend brend;
}
