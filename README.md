
# react-native-insta-capture-module

## Getting started

`$ npm install react-native-insta-capture-module --save`

### Mostly automatic installation

`$ react-native link react-native-insta-capture-module`

### Manual installation

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


## Usage
```javascript
import RNInstaCaptureModule from 'react-native-insta-capture-module';

// TODO: What to do with the module?
RNInstaCaptureModule;
```

### Example
```
<Text style={styles.welcome} onPress={() =>
  RNlibrary.takeScreenshot(
    {}, // no config yet 
    (uri) => { this.setState({encodedData: uri, modalVisible: true}) },
    (error) => { console.log('error not Good---->', error) }
  )}>Welcome to React Native! Please Press me! to Take a nice ScreenShot</Text>
<Modal
  animationType="slide"
  transparent={false}
  visible={this.state.modalVisible}
  onRequestClose={() => {
    this.setState({modalVisible: !this.state.modalVisible})
  }}>
  <View style={styles.viewImage}>
    <Image source={{uri: `data:image/png;base64,${this.state.encodedData}`}} resizeMode="contain"  style={styles.image}/>
    <Text style={styles.instructions} onPress={() => this.setState({modalVisible: !this.state.modalVisible})}>Back</Text>
  </View>
</Modal>
```
  
