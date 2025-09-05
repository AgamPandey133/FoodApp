//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//}
//
//android {
//    namespace = "com.example.foodapp"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.example.foodapp"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildFeatures{
//        viewBinding = true
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}
//
//dependencies {
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    implementation(libs.androidx.activity)
//    implementation(libs.androidx.constraintlayout)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//
////    Navigation component
//    implementation(libs.androidx.navigation.fragment)
//    implementation(libs.androidx.navigation.ui)
//
//    //intuit
//    implementation(libs.sdp.android)
//    implementation(libs.ssp.android)
//
//    //gif
//    implementation(libs.android.gif.drawable)
//
////    retrofit
//    implementation(libs.retrofit)
//    implementation(libs.converter.gson)
//
////    glide
//    implementation(libs.glide)
//
////    videoMode mvvm
//    implementation(libs.androidx.lifecycle.viewmodel.ktx)
//    implementation(libs.androidx.lifecycle.livedata.ktx)
//    implementation(libs.myextensions)
//
//    implementation(libs.androidx.lifecycle.viewmodel.ktx.v251) // Check for the latest version
//
//}




plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.foodapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.foodapp"
        minSdk = 24
        targetSdk = 35 // Updated to match compileSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
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

    // Navigation component
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)

    // Intuit
    implementation(libs.sdp.android)
    implementation(libs.ssp.android)

    // GIF
    implementation(libs.android.gif.drawable)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // Glide
    implementation(libs.glide)

    // VideoMode MVVM
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)

    // Ensure you are using the latest versions of lifecycle components
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v251) // Check for the latest version
    implementation(libs.myextensions) // Ensure this is compatible with AndroidX
}