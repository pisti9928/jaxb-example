package legoset;


import jakarta.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Minifig {

    @XmlValue
    private String title;

    @XmlAttribute
    private int count;

}
