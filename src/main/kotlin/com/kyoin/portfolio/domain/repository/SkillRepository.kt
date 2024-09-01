package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.constant.SkillType
import com.kyoin.portfolio.domain.entity.Link
import com.kyoin.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SkillRepository : JpaRepository<Skill, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Skill>

    // select * from skill where lower(name) = lower(:name) and skill_type = :type
    fun findByNameIgnoreCaseAndType(name: String, type: SkillType): Optional<Skill>
}