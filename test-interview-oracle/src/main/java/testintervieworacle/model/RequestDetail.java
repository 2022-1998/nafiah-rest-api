package testintervieworacle.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestDetail {
    @JsonProperty("service_id")
    private String serviceId;

    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("type")
    private String type;

    @JsonProperty("trx_id")
    private String trxId;
}
