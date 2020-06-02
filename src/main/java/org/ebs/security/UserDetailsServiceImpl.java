package org.ebs.security;

import java.util.Arrays;
import java.util.List;

import org.ebs.util.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer.UserDetailsBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service required by Spring Security to obtain additional information about
 * users
 * 
 * @author jarojas
 *
 */
@Service
@Transactional(readOnly=true)
class UserDetailsServiceImpl implements UserDetailsService {

   // private UserRepository userRepository;
   // private ConversionService conversionService;
    
	    // @Autowired
	    // public UserDetailsServiceImpl(UserRepository userRepository, ConversionService conversionService) {
		// 	super();
		// 	this.userRepository = userRepository;
		// 	this.conversionService = conversionService;
		// }

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // User user = userRepository.findByUsername(username);

        // if (user == null || !user.isEnabled()){
        // 	throw new UsernameNotFoundException("user missing or disabled");
        // }
        // return conversionService.convert(user, JwtUserDetails.class);
    System.out.println("setting user details>>>>>>>>>>>>>>");
        List<GrantedAuthority> auths = Arrays.asList(new SimpleGrantedAuthority("asd"), new SimpleGrantedAuthority("qwe"));
        return new EbsUser(username, auths, true);
    }
    

}
