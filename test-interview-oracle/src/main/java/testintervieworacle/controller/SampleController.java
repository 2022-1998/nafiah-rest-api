package testintervieworacle.controller;


import testintervieworacle.model.Request;
import testintervieworacle.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testintervieworacle.model.ResponseDetail;


@RestController
@RequestMapping("/external/services/rest")
public class SampleController {

    @PostMapping("/sample-service")
    public ResponseEntity<?> processRequest(@RequestBody Request request) {

        {
            Response response = new Response();
            ResponseDetail responseDetail = ResponseDetail.builder()
                            .errorCode("0000").errorMsg("success").trxId(request.getRequestDetail().getTrxId()).build();
            response.setResponseDetail(responseDetail);
            return ResponseEntity.ok(response);

        }

    }
}
