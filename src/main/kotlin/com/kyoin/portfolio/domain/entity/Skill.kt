package com.kyoin.portfolio.domain.entity

import com.kyoin.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    name: String,
    type: String,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함 

    // val achievement: Achievement
    // achievement.id
    var name: String = name

    @Column(name = "skill_type")
    @Enumerated(value = EnumType.STRING) // 숫자로 들어가면.. 순서 바뀌면 달라질수있으니까..
    var type: SkillType = SkillType.valueOf(type) // enum에서 찾아서 반환해줌

    var isActive: Boolean = isActive
}