# [Glassdoor Inc](https://www.glassdoor.com) Homework Project

## License agreement

By accessing and using this project in whole or in part, you agree to [the following terms and conditions](LICENSE.md).

## Assignment

Bring an existing project to release state and present it during the **Live Homework Assessment**.
The assignment has two components that will be assessed: following clear instructions and overall understanding of the project.

You have **48 hours** from receiving this assignment to submit your results.
The finished work must be available on [GitHub](https://github.com), and a link to the project repository must be provided before the next interview.
After the deadline, **every 4 hours of delay** are counted as **minus 1 point**.

### Preparations

- [x] Download and install the latest (stable) version of [Android Studio](https://developer.android.com/studio)
- [x] Download and extract the **Homework Project** to the destination folder
- [x] [Enable version control system for the project](https://docs.github.com/en/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github)

### Instructions

Each individual instruction about what should be done will be defined using a `TODO` and may contain a link to a resource with the corresponding topic or examples.
For each correctly completed instruction, **1 point** is awarded, which must then be defended at the **Live Homework Assessment** interview.

#### TODO

- [x] [AndroidManifest.xml](app/src/main/AndroidManifest.xml): [Define the required permissions](https://developer.android.com/develop/connectivity/network-ops/connecting)
- [x] [AndroidManifest.xml](app/src/main/AndroidManifest.xml): [Specify application class](https://developer.android.com/reference/android/app/Application)
- [x] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): [Declare the UI](https://developer.android.com/codelabs/jetpack-compose-basics#5) based on the UI model structure
- [x] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): [Request an image download](https://github.com/coil-kt/coil#requests)
- [x] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Define UI models for preview purposes
- [x] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Define UI models for preview purposes
- [x] [ContentComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ContentComponent.kt): Specify the [item key](https://developer.android.com/jetpack/compose/lists#item-keys) and [content type](https://developer.android.com/jetpack/compose/lists#content-type)
- [x] [CoroutineModule.kt](app/src/main/java/com/glassdoor/intern/utils/coroutine/CoroutineModule.kt): [Annotate the DI module](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules) with correct definitions and [component](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules)
- [x] [CoroutineModule.kt](app/src/main/java/com/glassdoor/intern/utils/coroutine/CoroutineModule.kt): Annotate dependency with the correct [qualifier label](https://developer.android.com/training/dependency-injection/hilt-android#multiple-bindings)
- [x] [DomainModule.kt](app/src/main/java/com/glassdoor/intern/domain/di/DomainModule.kt): Determine the [appropriate annotation](https://developer.android.com/codelabs/android-hilt#6) and provide the most optimal [scope component](https://developer.android.com/training/dependency-injection/hilt-android#generated-components)
- [x] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Call an action that hides the error message
- [x] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Define how long the error message will be displayed
- [x] [ErrorMessageComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/ErrorMessageComponent.kt): Define the [background color](https://developer.android.com/jetpack/compose/modifiers#scope-safety), as well as [the color, style, and alignment](https://developer.android.com/jetpack/compose/text/style-text) of the error message
- [x] [HeaderInfo.kt](app/src/main/java/com/glassdoor/intern/domain/model/HeaderInfo.kt): Determine undefined model properties
- [x] [HeaderInfoDto.kt](app/src/main/java/com/glassdoor/intern/data/model/HeaderInfoDto.kt): Define the structure of the DTO model based on the server response
- [x] [HeaderInfoMapper.kt](app/src/main/java/com/glassdoor/intern/data/mapper/HeaderInfoMapper.kt): Complete the transformation logic
- [x] [HeaderUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/HeaderUiModel.kt): Define empty state
- [x] [HeaderUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/HeaderUiModel.kt): Define the structure of the UI model based on the domain model
- [x] [HeaderUiModelMapper.kt](app/src/main/java/com/glassdoor/intern/presentation/mapper/HeaderUiModelMapper.kt): Convert domain model to UI model
- [x] [HeaderUiModelMapper.kt](app/src/main/java/com/glassdoor/intern/presentation/mapper/HeaderUiModelMapper.kt): Define date formatting pattern
- [x] [InfoApi.kt](app/src/main/java/com/glassdoor/intern/data/source/InfoApi.kt): Apply the [get annotation](https://square.github.io/retrofit) and specify the correct endpoint from `BuildConfig`
- [x] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert DTO into domain model
- [x] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [x] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [x] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Convert to error
- [x] [InfoRepositoryImpl.kt](app/src/main/java/com/glassdoor/intern/data/repository/InfoRepositoryImpl.kt): Inject the correct mapper dependency
- [x] [ItemUiModel.kt](app/src/main/java/com/glassdoor/intern/presentation/model/ItemUiModel.kt): Determine the key value
- [x] [LoggingModule.kt](app/src/main/java/com/glassdoor/intern/utils/logging/LoggingModule.kt): [Annotate the DI module](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules) with correct definitions and [component](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules)
- [x] [MainActivity.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainActivity.kt): [Annotate a class for dependency injection](https://developer.android.com/training/dependency-injection/hilt-android#android-classes)
- [x] [MainActivity.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainActivity.kt): Define the main composable to display
- [x] [MainModule.kt](app/src/main/java/com/glassdoor/intern/presentation/di/MainModule.kt): Define default values and provide initial state
- [x] [MainScreen.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainScreen.kt): [Consume UI state safely from the ViewModel](https://developer.android.com/codelabs/jetpack-compose-advanced-state-side-effects#3)
- [x] [MainScreen.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/MainScreen.kt): Define UI state for preview purposes
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Define the correct methods as callbacks
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Delegate method to `uiStateMachine`
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Emit the transformed UI model as state
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Inject the correct header mapper dependency
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Refresh the screen only when the header is empty
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Separate handling and update correct properties `previousUiState`
- [x] [MainViewModel.kt](app/src/main/java/com/glassdoor/intern/presentation/MainViewModel.kt): Transform the header domain model to the UI model
- [x] [Strings.xml](app/src/main/res/values/strings.xml): Provide a suitable application name
- [x] [TokenInterceptor.kt](app/src/main/java/com/glassdoor/intern/data/network/TokenInterceptor.kt): Declare the email address from your resume as a token
- [x] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Declare a [title](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Text(androidx.compose.ui.text.AnnotatedString,androidx.compose.ui.Modifier,androidx.compose.ui.graphics.Color,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.font.FontStyle,androidx.compose.ui.text.font.FontWeight,androidx.compose.ui.text.font.FontFamily,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextDecoration,androidx.compose.ui.text.style.TextAlign,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextOverflow,kotlin.Boolean,kotlin.Int,kotlin.Int,kotlin.collections.Map,kotlin.Function1,androidx.compose.ui.text.TextStyle)) using the app name resource from strings
- [x] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Define a component and use the state to preview it
- [x] [TopBarComponent.kt](app/src/main/java/com/glassdoor/intern/presentation/ui/component/TopBarComponent.kt): Define all possible states for preview purposes

#### Bonus points

- [ ] The application does not crash
- [ ] The previously loaded list remains on the screen after the error appears
- [x] All fulfilled `TODO` instructions remain in place, and the prefix is replaced with the word `DONE`
- [x] The project's change history has the [conventional commit messages](https://www.conventionalcommits.org/en/v1.0.0)
- [x] [The project has a history of changes](https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository)

#### What does not affect the rating

- [ ] Aesthetics and visual style
- [ ] Selecting a component layout

### Understanding

In the **Live Homework Assessment**, it's essential that the candidate can clearly explain the reasoning behind their decisions and modifications in the Homework assignment.
The primary goal of this session is to gain insight into the candidate's problem-solving approach and their rationale for the choices made during the assignment.
