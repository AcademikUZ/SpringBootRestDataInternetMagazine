package fan.company.springbootrestdatainternetmagazine.projection;

import fan.company.springbootrestdatainternetmagazine.entity.TechnicalСharacteristics;
import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = TechnicalСharacteristics.class)
public interface CustomTechnicalCharacteristics {

    public Long getId();

    public String getRAM();

    public String getCPU();

    public String getScreenDiagonal();

    public String getSSD();

    public String getHDD();

    public String getVideoСard();

    public String getColor();

    public double getOgranicheniyaPoVesu();

    public boolean isPodgolovnik();

}
