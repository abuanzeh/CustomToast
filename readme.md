![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164118_First_Library%5B1%5D.jpg?alt=media&token=0c777dde-74c4-4f41-99a2-fb12c70d1a4c "Optional title")

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164048_First_Library%5B1%5D.jpg?alt=media&token=db7edfb5-3bae-4bd7-9993-a1fe5f909512 "Optional title")

# Show amazing TOAST
# Dependencies 
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency :
```
implementation 'com.github.abuanzeh:AnzehLibrary:1.0.2'
```
# Example 

Get your Toast
``` kotlin 
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.showSuccessMessage(this,"SUCCESS")
        ToasterMessage.showErrorMessage(this,"ERROR")

    }
