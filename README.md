# mECEge
(pronounced "message")
Android app capable of sending and receiving messages

## GUI Design
<img src="https://github.com/ldev-r3-t4/mECEge/blob/master/Documentation/GUI_screenshot.png" width="200">

## Test

I created automated user interface tests for the front-end of the mECEge app using the instrumented unit test functionality of the Android Studio. The main purpose of the tests are to verify the functionality of the user interfaces like textview and buttons. I also utilized Google's Espresso to write reliable Android UI tests. For the final submission, tests for the front-end and back-end of the app will be combined.

You can find the automated user interface test at
./app/src/androidTest/java/com/mecege/mecege/InstrumentedTest_mECEge.java

## How to Run 

To run the tests, you have to run this program in Android Studio. You can use either the built-in phone emulator or an actual Android phone running Android Kitkat or newer. All you have to do is right-click the AndroidTest java directory (./app/src/androidTest/java) and select Run 'All Tests.'



