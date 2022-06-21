plugins {
    `java-platform`
}

group ="com.begemota"

val KotlinVer ="1.6.21"
val jcompose  ="1.2.0-rc01" //   "1.1.1"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:$KotlinVer")

        api("org.jetbrains.kotlin:kotlin-stdlib$KotlinVer")

        api("androidx.compose.material:material-icons-extended:$jcompose")
        api("androidx.compose.runtime:runtime:$jcompose")
        api("androidx.compose.material:material:$jcompose")
        api("androidx.compose.ui:ui-tooling:$jcompose")
        api("androidx.compose.ui:ui-util:$jcompose")
        api("androidx.compose.compiler:compiler:$jcompose")
        api("androidx.compose.foundation:foundation:$jcompose")
        api("androidx.compose.foundation:foundation-layout:$jcompose")

        api("androidx.customview:customview:1.1.0")
        api("androidx.customview:customview-poolingcontainer:1.0.0-beta02")

        api("androidx.activity:activity-compose:1.4.0")
        api("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")


        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.3")
        api("org.jetbrains.kotlin:kotlin-reflect:$KotlinVer")

       //plugins
        api("com.android.tools.build:gradle:7.2.1")
        api("org.jetbrains.kotlin:kotlin-gradle-plugin:$KotlinVer")
        api("org.jetbrains.kotlin.android:$KotlinVer")
        api("com.github.ben-manes.versions:0.42.0")
        //
        api("com.sun.mail:android-mail:1.6.7")
        api("com.sun.mail:android-activation:1.6.7")

        api("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.3")
        api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")

        api("com.jakewharton.timber:timber:5.0.1")
        api("io.github.microutils:kotlin-logging-jvm:2.1.23")
        api("com.squareup.leakcanary:leakcanary-android:2.9.1")

        api("com.google.cloud:google-cloud-logging-logback:0.123.1-alpha")
        api("com.google.cloud:google-cloud-storage:2.8.1")
        api("com.google.android.play:core:1.10.3")
        api("com.google.android.play:core-ktx:1.8.1")
        api("ch.qos.logback:logback-classic:1.2.3")

        val KtorVer                       = "2.0.2"
        api("io.ktor:ktor-client-cio:$KtorVer")
        api("io.ktor:ktor-client-logging-jvm:$KtorVer")
        api("io.ktor:ktor-client-encoding:$KtorVer")
        api("io.ktor:ktor-serialization:$KtorVer")
        api("io.ktor:ktor-client-content-negotiation:$KtorVer")
        api("io.ktor:ktor-client-serialization-jvm:$KtorVer")
        api("io.ktor:ktor-server-content-negotiation:$KtorVer")
        api("io.ktor:ktor-server-compression:$KtorVer")
        api("io.ktor:ktor-serialization-kotlinx-json:$KtorVer")
        api("io.ktor:ktor-server-netty:$KtorVer")
        api("io.ktor:ktor-server-tests:$KtorVer")

        api("org.jsoup:jsoup:1.15.1")

        api("junit:junit:4.13.2")
        api("androidx.test.ext:junit:1.1.2")
        api("androidx.test.espresso:espresso-core:3.3.0")
    }
}