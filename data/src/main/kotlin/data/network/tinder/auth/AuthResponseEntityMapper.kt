package data.network.tinder.auth

import data.network.common.EntityMapper
import domain.auth.DomainAuthedUser

internal class AuthResponseEntityMapper : EntityMapper<AuthResponse, DomainAuthedUser> {
    override fun transform(source: AuthResponse) = source.data.let { DomainAuthedUser(it.apiToken) }

}
