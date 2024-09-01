package com.kyoin.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest

@Entity
class HttpInterface(httpServletRequest: HttpServletRequest) : BaseEntity() { // 리퀘스트 정보를 여기서 넣어줌, 클라이언트 정보 꺼내오기
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null // instance를 처음 만들때는 null인데, 코틀린은 좀 더 엄격함 
    // val achievement: Achievement
    // achievement.id

    var cookie: String? = httpServletRequest.cookies
        ?.map { "${it.name}:${it.value}" } // 있으면 실행되고 없으면 넘어감, null일수도있으니까, it각각 객체에 대해서 name value 포맷팅
        ?.toString() // string으로 바꿔줌

    var referer: String? = httpServletRequest.getHeader("referer") // 요청이 어디에서 왔는지 ex ) 도메인

    var localAddr: String? = httpServletRequest.localAddr

    var remoteAddr: String? = httpServletRequest.remoteAddr

    var remoteHost: String? = httpServletRequest.remoteHost

    var requestUri: String? = httpServletRequest.requestURI

    var userAgent: String? = httpServletRequest.getHeader("user-agent")
}