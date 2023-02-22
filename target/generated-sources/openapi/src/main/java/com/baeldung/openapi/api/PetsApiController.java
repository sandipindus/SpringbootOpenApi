package com.baeldung.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T10:47:36.926025600+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:}")
public class PetsApiController implements PetsApi {

    private final PetsApiDelegate delegate;

    public PetsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PetsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PetsApiDelegate() {});
    }

    @Override
    public PetsApiDelegate getDelegate() {
        return delegate;
    }

}
