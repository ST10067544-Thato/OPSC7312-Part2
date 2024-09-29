plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.thatosapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.thatosapplication"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//    implementation(libs.kotlin.stdlib)
//    implementation(libs.androidx.core.ktx.v190)
//    implementation(libs.androidx.xappcompat)
//    implementation(libs.androidx.constraintlayout.v214)
//    implementation(libs.androidx.xlifecycle.livedata.ktx)
//    implementation(libs.androidx.xlifecycle.extensions)
//    implementation(libs.androidx.xlifecycle.viewmodel.ktx)
//    implementation(libs.androidx.xactivity.ktx)
//    implementation(libs.androidx.xfragment.ktx)
//    implementation(libs.material.v170)

    implementation(libs.koin.core)
    implementation(libs.koin.core.ext)
    implementation(libs.koin.androidx.scope)
    implementation(libs.koin.androidx.viewmodel)
    implementation(libs.xretrofit)
    implementation(libs.converter.gson)
    implementation(libs.xlogging.interceptor)
    implementation(libs.retrofit2.kotlin.coroutines.adapter)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.legacy.support.v4)

    implementation(libs.glide)
    annotationProcessor(libs.compiler)
    implementation(libs.xandroid.otpview.pinview)

    testImplementation("junit:junit:4.+")
//    androidTestImplementation(libs.androidx.junit.v114)
//    androidTestImplementation(libs.androidx.espresso.core.v350)
    implementation(libs.androidx.security.crypto)

    implementation(libs.lottie)
    implementation(libs.material.calendarview)
}
