import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun DependencyHandler.springBoot(module: String) = "org.springframework.boot:spring-boot-$module:1.5.14.RELEASE"

plugins {
    kotlin("plugin.spring") version "1.2.51"
}

dependencies {
    implementation(project(":valiktor-core"))
    implementation(project(":valiktor-spring:valiktor-spring"))
    implementation(project(":valiktor-spring:valiktor-spring-boot-autoconfigure"))
    implementation(kotlin("stdlib-jdk8"))
    implementation(springBoot("starter"))
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}