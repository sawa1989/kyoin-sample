package com.kyoin.portfolio.presentation.controller

import com.kyoin.portfolio.domain.constant.SkillType
import com.kyoin.portfolio.presentation.service.PresentationService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PresentationViewController(
    private val presentationService: PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "test"
    }

    @GetMapping("/")
    fun index(model: Model): String {
        var introductions = presentationService.getIntroductions()
        model.addAttribute("introductions", introductions)

        val links = presentationService.getLinks()
        model.addAttribute("links", links)

        return "presentation/index"
    }

    @GetMapping("/resume")
    fun resume(model: Model): String {
        var resume = presentationService.getResume()
        model.addAttribute("resume", resume)
        model.addAttribute("SkillTypes", SkillType.values())

        return "presentation/resume"
    }

    @GetMapping("/projects")
    fun projects(model: Model): String {
        var projects = presentationService.getProjects()
        model.addAttribute("projects", projects)

        return "presentation/projects"
    }
}