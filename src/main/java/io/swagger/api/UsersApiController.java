package io.swagger.api;

import io.swagger.model.Profile;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T14:46:00.241133645Z[GMT]")
@RestController
public class UsersApiController implements UsersApi {

    private final UserService userService;

    @Autowired
    public UsersApiController(UserService userService) {
        this.userService = userService;
    }


    @Override
    public ResponseEntity<Void> usersGet() {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersPost(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersUserIdDelete(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<User> usersUserIdGet(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<Profile> usersUserIdProfileGet(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersUserIdProfilePost(String userId, Profile body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersUserIdProfileProfileIdDelete(String userId, String profileId) {
        return null;
    }

    @Override
    public ResponseEntity<Profile> usersUserIdProfileProfileIdGet(String userId, String profileId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersUserIdProfileProfileIdPut(String userId, String profileId, Profile body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> usersUserIdPut(String userId, User body) {
        return null;
    }
}
