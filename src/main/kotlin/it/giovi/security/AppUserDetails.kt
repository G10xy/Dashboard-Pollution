package it.giovi.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails


class AppUserDetails(
    private val id: String,
    private val username: String,
    private val password: String,
    private val authorities: MutableCollection<GrantedAuthority>,
    private val accountNonExpired: Boolean,
    private val accountNonLocked: Boolean,
    private val credentialsNonExpired: Boolean,
    private val enabled: Boolean
): UserDetails {

    override fun getAuthorities(): Collection<GrantedAuthority> {
        return authorities
    }

    override fun getPassword(): String {
        return password
    }

    override fun getUsername(): String {
        return username
    }

    override fun isEnabled(): Boolean {
        return enabled
    }

    override fun isAccountNonExpired(): Boolean {
        return accountNonExpired
    }

    override fun isAccountNonLocked(): Boolean {
        return accountNonLocked
    }

    override fun isCredentialsNonExpired(): Boolean {
        return credentialsNonExpired
    }

    override fun hashCode(): Int {
        return username.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AppUserDetails

        if (password != other.password) return false
        if (username != other.username) return false
        if (authorities != other.authorities) return false
        if (accountNonExpired != other.accountNonExpired) return false
        if (accountNonLocked != other.accountNonLocked) return false
        if (credentialsNonExpired != other.credentialsNonExpired) return false
        if (enabled != other.enabled) return false

        return true
    }
}