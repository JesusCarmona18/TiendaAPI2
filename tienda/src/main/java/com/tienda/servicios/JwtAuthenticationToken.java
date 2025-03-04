package com.tienda.servicios;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtAuthenticationToken {

    public JwtAuthenticationToken(UserDetails userDetails, Object object,
            Collection<? extends GrantedAuthority> authorities) {
        //TODO Auto-generated constructor stub
    }

    JwtAuthenticationToken(UserDetails userDetails, Object object, Collection<? extends GrantedAuthority> authorities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
