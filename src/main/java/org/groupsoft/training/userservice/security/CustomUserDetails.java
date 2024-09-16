package org.groupsoft.training.userservice.security;

public class CustomUserDetails {
}
//implements UserDetails {
//
//	private static final long serialVersionUID = -7963640622705230403L;
//	private final UserEntity user;
//
//	public CustomUserDetails(UserEntity user) {
//		this.user = user;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
////				(Collection<? extends GrantedAuthority>) user.getRoles();
//	}
//
//	@Override
//	public String getPassword() {
//		return user.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		return user.getUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//	public UserEntity getUser() {
//		return user;
//	}
//}
