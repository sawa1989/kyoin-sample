package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.Achievement
import com.kyoin.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>{


    fun findAllByIsActive(isActive: Boolean): List<Introduction>
}