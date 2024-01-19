package testintervieworacle.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @JsonProperty("sampleservicerq")
    private RequestDetail requestDetail;
}
