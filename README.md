# DemoLib

Simple Toast Generation

> Step 1. Add the JitPack repository to your build file

```
gradle
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  > Step 2. Add the dependency
  
  ```
  dependencies {
	        implementation 'com.github.implement-import-export:DemoLib:Toast'
	}
  ```

> In MainActivity need to write this :

```
Toaster.simpleToast(CONTEXT,MESSAGE);
```
