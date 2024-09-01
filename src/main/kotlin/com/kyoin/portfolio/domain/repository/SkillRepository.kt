package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>