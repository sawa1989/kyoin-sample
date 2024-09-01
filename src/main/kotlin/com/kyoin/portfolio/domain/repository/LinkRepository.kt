package com.kyoin.portfolio.domain.repository

import com.kyoin.portfolio.domain.entity.Introduction
import com.kyoin.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>{


    fun findAllByIsActive(isActive: Boolean): List<Link>
}