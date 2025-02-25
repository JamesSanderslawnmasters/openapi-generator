package org.openapitools.api;

import org.openapitools.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AnotherFakeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface AnotherFakeApiDelegate {

    /**
     * PATCH /another-fake/dummy : To test special tags
     * To test special tags and operation ID starting with number
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     * @see AnotherFakeApi#call123testSpecialTags
     */
    ResponseEntity<Client> call123testSpecialTags(Client body);

}
