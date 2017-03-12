package cn.com.sina.alan.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * Created by on 2017.03.08.
 */
@Configuration
public class JwtConfiguration {
    @Autowired
    JwtAccessTokenConverter jwtAccessTokenConverter;

    @Bean
    @Qualifier("tokenStore")
    public TokenStore tokenStore() {

        System.out.println("Created JwtTokenStore");
        return new JwtTokenStore(jwtAccessTokenConverter);
    }

    //    @Bean
    //    protected JwtAccessTokenConverter jwtTokenEnhancer() {
    //        JwtAccessTokenConverter converter =  new JwtAccessTokenConverter();
    //        Resource resource = new ClassPathResource("public.cert");
    //        String publicKey = null;
    //        try {
    //            publicKey = new String(FileCopyUtils.copyToByteArray(resource.getInputStream()));
    //        } catch (IOException e) {
    //            throw new RuntimeException(e);
    //        }
    //        converter.setVerifierKey(publicKey);
    //        return converter;
    //    }

    @Bean
    protected JwtAccessTokenConverter jwtTokenEnhancer() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("123");
        return converter;
    }
}
