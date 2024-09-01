package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.Introduction
import com.kyoin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository : JpaRepository<Project, Long>{

    // 성능에 별로 안좋음
    fun findAllByIsActive(isActive: Boolean): List<Project>

    //override fun findByID(id: Long): Optional<Project>
}