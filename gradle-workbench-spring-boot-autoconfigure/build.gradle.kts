plugins {
    `java-library`
}

// Only reference dependencies as compileOnly since the starter will be responsible for defining all required
// transitive dependencies
val springBootVersion: String by extra
dependencies {
    // This is the mandatory library supported by this Starter and handled by the auto configuration.
    // It will be a transitive dependency and will be automatically included by the consumer.
    // However the starter will define this as a required transitive dependency
    api(project(":greet-library"))

    // This is the optional library supported by this Starter and handled by the auto configuration.
    // It will not be a transitive dependency but has to be declared as a dependency by the consumer
    compileOnly(project(":greet-opt-library"))

    compileOnly("org.springframework.boot:spring-boot-starter:$springBootVersion")
    annotationProcessor ("org.springframework.boot:spring-boot-autoconfigure-processor:$springBootVersion")
    annotationProcessor ("org.springframework.boot:spring-boot-configuration-processor:$springBootVersion")
}
