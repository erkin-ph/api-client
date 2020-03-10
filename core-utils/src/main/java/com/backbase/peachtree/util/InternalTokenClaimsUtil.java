package com.backbase.peachtree.util;

import com.backbase.buildingblocks.jwt.core.exception.TokenKeyException;
import com.backbase.buildingblocks.jwt.core.token.JsonWebTokenClaimsSetUtils;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * @author William Suane
 */
public class InternalTokenClaimsUtil {
    private InternalTokenClaimsUtil() {

    }

    public static String getAccountHolderId() {

        Optional subOptional = JsonWebTokenClaimsSetUtils.getClaim(SecurityContextHolder.getContext().getAuthentication(), "accountHolderId");
        if (!subOptional.isPresent())
            throw new TokenKeyException("accountHolderId  claim not found");
        return subOptional.get().toString();
    }

    public static String getUsername() {
        Optional subOptional = JsonWebTokenClaimsSetUtils.getClaim(SecurityContextHolder.getContext().getAuthentication(), "sub");
        if (!subOptional.isPresent())
            throw new TokenKeyException("Sub claim not found");
        return subOptional.get().toString();
    }

    public static String getCoreToken() {
        Optional subOptional = JsonWebTokenClaimsSetUtils.getClaim(SecurityContextHolder.getContext().getAuthentication(), "token");
        if (!subOptional.isPresent())
            throw new TokenKeyException("Token claim not found");
        return subOptional.get().toString();
    }

}