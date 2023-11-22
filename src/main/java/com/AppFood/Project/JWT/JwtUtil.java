//package com.AppFood.Project.JWT;
//
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//@Service
//public class JwtUtil {
//    private String secrect = "Foodapp";
//
//    public String extractUsername(String tocken)
//    {
//        return extractClaims(tocken Claims::getSubject);
//    }
//     public Date extractexpiration(String,token)
//     {
//        return extractClaims(token,Claims::getExpiration);
//
//     }
//    public <T> T extractClaims(String token, Function<Claims, T> claimsResolver) {
//        final Claims claims = extractAllClaims(token);
//        return ClaimsResolver.apply(claims);
//    }
//
//    public Claims extractAllClaims(String tocken)
//    {
//        return Jwts.parser().setSignKey(secrect).parseClaimsJws(tocken).getBody();
//    }
//
//    private boolean isTokenExpired(String token)
//    {
//        return extractExpiration(token).before(new Date());
//
//    }
//   public String generateToken(String usernsme,String role){
//       Map<String,Object>claims = new HashMap<>();
//       claims.put("role",role);
//       return  createToken(claims,usernsme)
//   }
//
//
//    private String createToken(Map<String, oubject>Claims,String subject)
//    {
//        return Jwts.builder()
//                .setClaims(claims)
//                .setsubject(subject)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() +1000 * 60 * 10))
//                .signWith(SignatureAlgorithm.HS256,secrect).compact();
//
//
//    }
//    public Boolean validateToken(String token,UserDetails,userDeails)
//    {
//        final String username = extractUsername(token);
//        return (username.equals(userDetails.getUsername(token)))&& !isTokenExpired(token);
//
//    }
//
//
//}
