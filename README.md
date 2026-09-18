# 📱 Mobile Development Learning Portfolio

**Android Basics with Compose — Google Android Developers**

This repository is my learning portfolio for the **Android Basics with Compose** course. It documents every module I complete — Kotlin fundamentals, Jetpack Compose UI, and state management — with source code, real screenshots, and a written analysis for each.

---

## 👤 Student Information

| Field      | Details                              |
| ---------- | ------------------------------------- |
| Name       | Amir Wuhab Nurhussen                  |
| Student ID | AIU24102454                           |
| University | _ALBUKHARY INTERNATIONAL UNIVERSITY_  |

---

## 🎓 Course Information

| Field       | Details                                                              |
| ----------- | --------------------------------------------------------------------- |
| Course      | Android Basics with Compose                                          |
| Provider    | Google Android Developers                                            |
| Course link | https://developer.android.com/courses/android-basics-compose/course  |
| Language    | Kotlin                                                                |
| Tools       | Android Studio, Jetpack Compose, Gradle, Android Emulator             |

---

## 📋 Assessment Overview

This repository serves as **continuous assessment evidence** for the Android Basics with Compose course. Each module below corresponds to one pathway (or capstone project) from the official course, and contains:

- **Source Code** — the actual Kotlin/Compose files for that pathway's codelabs
- **Screenshots** — real evidence the code was run and produces the expected result
- **Analysis.md** — a written breakdown of the concepts covered, the codelabs completed, and what was learned

The portfolio currently covers **Unit 1 (Your First Android App)** and **Unit 2 (Building App UI)** in full, across 8 modules. Every Compose app was actually compiled, installed on an Android emulator (`Pixel_9`), run, and screenshotted with `adb`. Every console-only Kotlin exercise was actually compiled and executed on the JVM, with its real captured output rendered into a screenshot.

---

## 📂 Repository Structure

```
mobile-app-learning-portfolio/
├── README.md
│
├── Module-1/                          ← Unit 1, Pathway 1: Introduction to Kotlin
│   ├── Source Code/
│   │   ├── FirstProgram.kt            ← Your first program in Kotlin
│   │   ├── Variables.kt               ← Create and use variables in Kotlin
│   │   ├── Functions.kt               ← Create and use functions in Kotlin
│   │   └── PracticeKotlinBasics.kt    ← Practice: Kotlin Basics
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-2/                          ← Unit 1, Pathway 2: Setup Android Studio & First App
│   ├── Source Code/
│   │   └── GreetingCard/              ← Create your first Android app
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-3/                          ← Unit 1, Pathway 3: Build a Basic Layout
│   ├── Source Code/
│   │   ├── BirthdayCard/              ← Build a simple app with text composables
│   │   ├── ComposeQuadrant/           ← Practice: Compose Basics
│   │   ├── ComposeArticle/            ← Practice: Compose Basics
│   │   └── TaskManager/               ← Practice: Compose Basics
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-4/                          ← Unit 1 Capstone Project
│   ├── Source Code/
│   │   └── BusinessCard/              ← Project: Create a Business Card app
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-5/                          ← Unit 2, Pathway 1: Kotlin Fundamentals
│   ├── Source Code/
│   │   ├── ConditionalsAndNullability.kt  ← Conditionals & nullability
│   │   ├── ClassesAndObjects.kt           ← Classes and objects
│   │   ├── LambdasAndHighOrderFunctions.kt← Function types & lambdas
│   │   └── PracticeKotlinFundamentals.kt  ← Practice: Kotlin Fundamentals
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-6/                          ← Unit 2, Pathway 2: Add a Button to an App
│   ├── Source Code/
│   │   └── DiceRoller/                ← Create an interactive Dice Roller app
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-7/                          ← Unit 2, Pathway 3: Interacting with UI and State
│   ├── Source Code/
│   │   ├── Lemonade/                  ← Intro to state in Compose
│   │   └── TipTime/                   ← Calculate a custom tip
│   ├── Screenshots/
│   └── Analysis.md
│
├── Module-8/                          ← Unit 2 Capstone Project
│   ├── Source Code/
│   │   └── ArtSpace/                  ← Project: Create an Art Space app
│   ├── Screenshots/
│   └── Analysis.md
│
├── Reflection/
│   └── Reflection.md
│
├── References/
│   └── README.md
│
└── Assets/
    └── README.md
```

---

## 🚀 How to Run

**Modules 1 and 5** are pure Kotlin console files and can be run in:

1. **[Kotlin Playground](https://play.kotlinlang.org/)** — paste the code online and click ▶ Run
2. **IntelliJ IDEA** — open as a Kotlin project and run `main()`

**Modules 2, 3, 4, 6, 7, and 8** are Jetpack Compose UI files. Each `MainActivity.kt` is a self-contained composable extracted from an Android Studio project. To run one: create a new **Empty Activity (Compose)** project in Android Studio with the matching package name (shown at the top of each file), replace the generated `MainActivity.kt` with the provided one, and run it on an emulator or physical device.

---

## ✅ Learning Modules Completed

| Module   | Pathway / Project                                     | Unit | Status      |
| -------- | ------------------------------------------------------- | ---- | ----------- |
| Module 1 | Introduction to Kotlin                                  | 1    | ✅ Complete |
| Module 2 | Setup Android Studio & First App                        | 1    | ✅ Complete |
| Module 3 | Build a Basic Layout                                     | 1    | ✅ Complete |
| Module 4 | Project: Business Card app                               | 1    | ✅ Complete |
| Module 5 | Kotlin Fundamentals                                       | 2    | ✅ Complete |
| Module 6 | Add a Button to an App                                    | 2    | ✅ Complete |
| Module 7 | Interacting with UI and State                             | 2    | ✅ Complete |
| Module 8 | Project: Art Space app                                     | 2    | ✅ Complete |

---

## 💭 Reflection Summary

A full written reflection is available in [`Reflection/Reflection.md`](Reflection/Reflection.md). In short: Unit 1's Kotlin fundamentals and Unit 2's conditionals, nullability, classes, and lambdas were never isolated exercises — they showed up directly in every later app, from the `data class Artwork` in Art Space to the lambda passed to a `Button`'s `onClick` in Dice Roller. The real turning point was Module 6, where `remember { mutableStateOf(...) }` first introduced the idea that a composable's output is a function of state. Building complete apps (Business Card, Dice Roller, Lemonade, Tip Time, Art Space) rather than only isolated exercises was the most effective way to see how variables, functions, state, and layout composables fit together in a real app — and actually running every app surfaced a real compile bug in Tip Time's source that reading alone would have missed.

---

## 🛠️ Technologies Used

- Kotlin
- Jetpack Compose
- Android Studio
- Android SDK / Gradle
- Android Emulator (`Pixel_9`, AVD)

---

## 📊 Project Status

**Status:** ✅ Complete — Units 1–2 finished, with every app compiled, run, and screenshotted for real.
