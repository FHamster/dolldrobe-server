package com.fhamster.dolldrobe.util;

import com.fhamster.dolldrobe.model.User;
import com.sun.mail.imap.protocol.BODY;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    //
    static final String SECRET = "FHamster";

    public static String generateToken(String userAcc) {
        HashMap<String, Object> map = new HashMap<>();

        //you can put any data in the map
        map.put("userAcc", userAcc);

        //token_alive_time
        long tokenAT = 7200_000L;

//                .setExpiration(new Date(System.currentTimeMillis() + 3600_000_000L))// 1000 hour
        //构建jwt
        //jwt建造器,使用建造者模式,流式操作
        JwtBuilder builder = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + tokenAT))// 1 hour
                .signWith(SignatureAlgorithm.HS512, SECRET);

        //jwt前面一般都会加Bearer
        return builder.compact();
    }

    public static User validateToken(String token) {
        try {
            // parse the token.
            Map<String, Object> jwtbody = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();

            User user = new User();
            user.setuAccountnumber((String) jwtbody.get("userAcc"));

            return user;
        } catch (Exception e) {
            throw new IllegalStateException("Invalid Token. " + e.getMessage());
        }

    }
}