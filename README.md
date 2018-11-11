
# react-native-insta-capture-module

## Getting started

`$ npm install react-native-insta-capture-module --save`

### Mostly automatic installation

`$ react-native link react-native-insta-capture-module`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-insta-capture-module` and add `RNInstaCaptureModule.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNInstaCaptureModule.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNInstaCaptureModulePackage;` to the imports at the top of the file
  - Add `new RNInstaCaptureModulePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-insta-capture-module'
  	project(':react-native-insta-capture-module').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-insta-capture-module/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-insta-capture-module')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNInstaCaptureModule.sln` in `node_modules/react-native-insta-capture-module/windows/RNInstaCaptureModule.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Insta.Capture.Module.RNInstaCaptureModule;` to the usings at the top of the file
  - Add `new RNInstaCaptureModulePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNInstaCaptureModule from 'react-native-insta-capture-module';

// TODO: What to do with the module?
RNInstaCaptureModule;
```
  