package com.kyoin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction(
    content: String,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함 

    // val achievement: Achievement
    // achievement.id
    var content: String = content
    var isActive: Boolean = isActive
}