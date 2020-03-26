import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    id("org.springframework.boot") version "2.3.0.M3" apply false
    id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
    kotlin("jvm") version "1.3.71" apply false
    kotlin("plugin.spring") version "1.3.71" apply false
}

allprojects {
    group = "br.com.multiproject"
    version = "1.0"

    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://repo.spring.io/milestone") }
    }
}

dependencies {
    // faz com que a configuração dos arquivos do projeto raiz dependa de cada subprojeto
    subprojects.forEach {
        archives(it)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
