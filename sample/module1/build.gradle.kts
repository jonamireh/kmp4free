plugins {
  alias(libs.plugins.kotlin.jvm)
}

dependencies {
  implementation(project(":sample:module2"))
}
