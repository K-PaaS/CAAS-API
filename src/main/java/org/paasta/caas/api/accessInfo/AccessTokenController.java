package org.paasta.caas.api.accessInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccessToken Controller 클래스
 *
 * @author hrjin
 * @version 1.0
 * @since 2018-09-04
 */
@RestController
@RequestMapping("/accessInfo")
public class AccessTokenController {

    private final AccessTokenService accessTokenService;

    /**
     * Instantiates a new accessToken controller
     *
     * @param accessTokenService the accessToken service
     */
    @Autowired
    public AccessTokenController(AccessTokenService accessTokenService) {
        this.accessTokenService = accessTokenService;
    }

    /**
     * Secret 상세 정보를 조회한다.
     *
     * @param namespace the namespace
     * @param accessTokenName the accessTokenName
     * @return the AccessToken
     */
    @RequestMapping(value = "/namespaces/{namespace}/secrets/{accessTokenName}")
    @ResponseBody
    public AccessToken getSecret(@PathVariable("namespace") String namespace, @PathVariable("accessTokenName") String accessTokenName){
        return accessTokenService.getSecret(namespace, accessTokenName);
    }
}
