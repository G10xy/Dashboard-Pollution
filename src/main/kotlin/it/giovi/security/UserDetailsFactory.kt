package it.giovi.security

import it.giovi.persistence.entity.UserEntity
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority


class UserDetailsFactory {

    companion object {
        fun create(user: UserEntity): AppUserDetails {
            val authorities: MutableCollection<GrantedAuthority> = ArrayList()
            authorities.add(SimpleGrantedAuthority(user.role.name))
            return AppUserDetails(
                user.id,
                user.username,
                user.password,
                authorities,
                true,
                true,
                true,
                true
            )
        }
    }
}