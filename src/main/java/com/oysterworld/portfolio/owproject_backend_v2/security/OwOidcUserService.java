package com.oysterworld.portfolio.owproject_backend_v2.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OwOidcUserService extends OidcUserService {
//    @Autowired
//    UserBusinessLogic userBusinessLogic;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        var user = super.loadUser(userRequest);
//        String email = user.getEmail();
//        userBusinessLogic.registUser(email);
//        if (userBusinessLogic.findUserByEmail(email) == null) {
//            throw new OAuth2AuthenticationException("このGoogleアカウントは許可されていません");
//        }
        return user;
    }
}
