# MasterMindy
## The customizable Mastermind clone - android edition

- License: MIT License
- Author: Matteljay
- Language: Java
- IDE: Android Studio
- Homepage: https://github.com/Matteljay


## Screenshots

![](https://github.com/Matteljay/mastermindy-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png)
![](https://github.com/Matteljay/mastermindy-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png)
![](https://github.com/Matteljay/mastermindy-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png)
![](https://github.com/Matteljay/mastermindy-android/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png)


## About

MasterMindy is based on Mastermind, a turn-based code breaking game. The app will generate a secret code for you to deduce.
You will only receive minimal hints. A black hint means you positioned a pawn perfectly... but which one? A white hint
means one of your selected pawns is correct but in the wrong place. Play alone or with friends to try and solve this puzzle.
You can easily change the difficulty on the settings page.


Introduction video, strategy & further reading:
- <https://www.youtube.com/watch?v=DtAQfHpt6_8>
- <https://www.youtube.com/watch?v=XX5TlB6xT3M>
- <https://en.wikipedia.org/wiki/Mastermind_(board_game)>


## Game Features

- Scaling orientation changes on the fly for phones and tables
- Flexible amount of pawn fields
- Flexible assortment of pawn colors to choose from
- Difficulty change for allowing duplicate colors in the secret
- Ability to show collision sensitive startup hints
- Save-game ability so that you may continue another time
- Various time and turn limiting capabilities
- Drag & drop pawns on long-press
- Option to disable screen sleeping while you think about your turn
- Uniquely named pawns for color blind people 
- Translated into various languages: spanish, portuguese, german, french, polish and dutch
- Bitcoin donation ability :)


## Coding Details

- Compatible with API 21 (Android 5.0 Lollipop) and upward
- Layout: 16 classes with an average length of 80 lines per class
- Dynamic View placement & GUI construction during runtime
- ViewModel MVVM & SharedPreferences for persistent memory storage
- Migrated project to AndroidX (Jetpack)
- See Java Swing project [MasterMindy-desktop](https://github.com/Matteljay/mastermindy-desktop) for game logic unit testing


## How to run

- Make sure to allow installation from unknown sources. This app will NOT ask special permissions (access to your contacts, files, fotos,..)
it will NOT connect to the internet. Learn more about installing an APK file from unknown sources [here](https://www.androidcentral.com/unknown-sources)
- Download & run the latest .apk file from the [releases](https://github.com/Matteljay/mastermindy-android/releases) page
- Alternatively, you can download it from F-Droid [here](https://f-droid.org/packages/eth.matteljay.mastermindy/)

## Thanks
Copyright (C) 2019 Matteljay

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation files
(the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge,
publish, distribute, sublicense, and/or sell copies of the Software,
and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
