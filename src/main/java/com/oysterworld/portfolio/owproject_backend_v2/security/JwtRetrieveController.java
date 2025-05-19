package com.oysterworld.portfolio.owproject_backend_v2.security;

import com.oysterworld.portfolio.owproject_backend_v2.common.RedisUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("${api.base-path}")
public class JwtRetrieveController {
    @GetMapping("/jwt")
    public ResponseEntity<Map<String, String>> jwtRetrive(HttpSession session) {
        var jwt = RedisUtil.get("jwt");
        if(jwt != null) {
            return ResponseEntity.ok(Map.of("jwt", jwt));
        }
        return ResponseEntity.ok().body(new HashMap<>());
    }
}
