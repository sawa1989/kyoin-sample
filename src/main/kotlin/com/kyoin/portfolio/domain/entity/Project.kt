package com.kyoin.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Project(
    name: String,
    description: String,
    startYear: Int,
    startMonth: Int,
    endYear: Int?,
    endMonth: Int?,
    isActive: Boolean
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함 
    // val achievement: Achievement
    // achievement.id

    var name: String? = name

    var description: String? = description

    var startYear: Int = startYear

    var startMonth: Int = startMonth

    var endYear: Int? = endYear

    var endMonth: Int? = endMonth

    var isActive: Boolean = isActive

    @OneToMany(
        targetEntity = ProjectDetail::class,
        fetch = FetchType.LAZY,// lazy 연관관계 있을때만 ㅇㅇ
        cascade = [CascadeType.ALL]
    ) // 영속성 같이 넣어줌
    @JoinColumn(name = "project_id")
    var details: MutableList<ProjectDetail> = mutableListOf() // 데이터를 넣고 빼고 가능

    @OneToMany(mappedBy = "project")
    var skills: MutableList<ProjectSkill> = mutableListOf()

    fun getEndYearMonth(): String {
        if (endYear == null || endMonth == null) {
            return "Present"
        }

        return "${endYear}.${endMonth}" // ex) 2024.09
    }

    fun udpate(
        name: String,
        description: String,
        startYear: Int,
        startMonth: Int,
        endYear: Int?,
        endMonth: Int?,
        isActive: Boolean
    ) {
        this.name = name
        this.description = description
        this.startYear = startYear
        this.startMonth = startMonth
        this.endYear = endYear
        this.endMonth = endMonth
        this.isActive = isActive
    }

    fun addDetails(details: MutableList<ProjectDetail>?) {
        if (details != null) {
            this.details.addAll(details)
        }
    }
}