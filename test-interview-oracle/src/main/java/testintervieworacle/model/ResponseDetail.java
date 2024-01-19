package testintervieworacle.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDetail {

    @JsonProperty("error_code")
    public String errorCode;

    @JsonProperty("error_msg")
    public String errorMsg;
    @JsonProperty("trx_id")
    public String trxId;

}
