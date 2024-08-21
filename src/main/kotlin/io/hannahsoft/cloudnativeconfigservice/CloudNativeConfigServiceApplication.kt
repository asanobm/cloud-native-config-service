package io.hannahsoft.cloudnativeconfigservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CloudNativeConfigServiceApplication

fun main(args: Array<String>) {
    runApplication<CloudNativeConfigServiceApplication>(*args)
}
