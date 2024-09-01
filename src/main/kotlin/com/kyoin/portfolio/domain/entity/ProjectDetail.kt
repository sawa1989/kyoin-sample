package com.kyoin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail(
    content: String,
    url: String?,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함 
    // val achievement: Achievement
    // achievement.id

    var content: String = content

    var url: String? = url

    var isActive: Boolean = isActive

    fun update(content: String, url: String?, isActive: Boolean) {
        this.content = content
        this.url = url
        this.isActive = isActive
    }
}