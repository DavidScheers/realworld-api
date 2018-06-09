package io.realworld.persistence

import io.realworld.domain.users.User

data class UserModel(
  val email: String,
  val token: String,
  val username: String,
  val password: String,
  val bio: String? = null,
  val image: String? = null
) {
  fun toDomain() = User(email = email, token = token, username = username, bio = bio, image = image)
}
