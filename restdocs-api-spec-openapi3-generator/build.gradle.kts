plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    jcenter()
}

val jacksonVersion: String by extra
val junitVersion: String by extra

dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile(project(":restdocs-api-spec-model"))
    compile(project(":restdocs-api-spec-jsonschema"))

    compile("io.swagger.core.v3:swagger-core:2.0.8")
    compile("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")

    testImplementation("io.swagger:swagger-parser:2.0.0-rc1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    testImplementation("org.assertj:assertj-core:3.10.0")

    testImplementation("com.jayway.jsonpath:json-path:2.4.0")
}


