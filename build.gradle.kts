plugins {
    id("java")
    kotlin("jvm") version "2.0.21"
    id("org.docstr.gwt") version "2.1.4"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.gwtproject:gwt-user:2.12.1")
    compileOnly("org.gwtproject:gwt-dev:2.12.1")
    testImplementation("junit:junit:4.13.2")
}
gwt {
    modules = listOf("dev.sayaya.AsyncTest")
    devMode {
        war = file("src/main/webapp")
    }
}
tasks {
    test {
        useJUnit()
    }
}