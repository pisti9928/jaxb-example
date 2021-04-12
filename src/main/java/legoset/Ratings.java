package legoset;

import jakarta.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ratings {



    @XmlAttribute
    private int count;
    @XmlAttribute
    private double avg;

}
