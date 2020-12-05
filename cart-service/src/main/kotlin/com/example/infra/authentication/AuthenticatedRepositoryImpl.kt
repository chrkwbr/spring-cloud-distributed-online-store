package com.example.infra.authentication

import com.example.model.user.Authenticated
import com.example.model.user.AuthenticatedRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
class AuthenticatedRepositoryImpl: AuthenticatedRepository {
    override fun getAuthenticated(): Authenticated? {
//        TODO("Not yet implemented")
        return Authenticated(id = 0,
                username = "user",
                firstname = "first",
                lastname = "last",
                createdAt = LocalDateTime.now(),
                createdBy = "creater",
                updatedAt = LocalDateTime.now(),
                updatedBy = "updater",
                version = 0)
    }
}
