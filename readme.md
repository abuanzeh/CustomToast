![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164118_First_Library%5B1%5D.jpg?alt=media&token=55c76cf4-a467-44ce-9c47-f181834b0b70 "Optional title")

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164048_First_Library%5B1%5D.jpg?alt=media&token=4133d107-b6af-4173-998e-901b07cd8f2d "Optional title")



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
