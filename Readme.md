## What is this repo?
This is a very basic sample of a nodejs backend written entirely in kotlin. This allows us to harvest all the niceness
of Kotlin while also allowing deployment on any lightweight environment of your choice.

## What to expect?
This is a multi-module project where most of the modules have been build using [dukat](http://github.com/kotlin/dukat) but have then been manually tuned to fix the errors in the generated code.

The project code is located in the `app` module. Although its in a very initial state it is my intention is to keep adding features into it.  

## How to Run
You can either run it with gradle or npm.

### With Gradle
```console
./gradlew nodeRun --continuous
```
or shorter
```console
./gradlew nodeRun -t
```

### With npm
Run the following command in one terminal
```console
./gradlew compileProductionExecutableKotlinJs -t
```
open a second terminal and run
```
nodemon build/js/packages/app/kotlin/app.js
```
(I personally like [nodemon](https://nodemon.io/) which can be easily installed and auto-reloads with the changes)

### Next steps
- Add actual code to the `app` rather than the gibberish I wrote so far for testing
- Publish the modules (not the app) into mavenCentral in case they are useful
- Possibly improve namings (tbd)
- Hopefully improve gradle configuration, although I think it's not that bad it could probably be improved