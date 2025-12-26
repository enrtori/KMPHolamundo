package org.enr.projectentrada

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform