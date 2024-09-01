package com.kyoin.portfolio.domain.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Achievement(
    title: String,
    description: String,
    achievedDate: LocalDate?,
    host: String, isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함

    // val achievement: Achievement
    // achievement.id
    var title: String = title
    var description: String = description
    var achievedDate: LocalDate? = achievedDate
    var host: String = host
    var isActive: Boolean = isActive
}