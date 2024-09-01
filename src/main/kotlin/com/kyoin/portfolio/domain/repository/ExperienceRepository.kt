package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.Experience
import com.kyoin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Experience>

}