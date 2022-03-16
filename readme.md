<img src=" width="128"/>

         <img alt="Qries" src=""https://drive.google.com/file/d/1JYeIFuRufwDhe3arjbAiq9hsKwXXLfD1/view?usp=sharing"
         width=150" height="70">
      
Show amazing TOAST
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
implementation 'com.github.abuanzeh:AnzehLibrary:1.0.1'
```
# Example 

Get your Toast
``` kotlin 
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.show(this , "TEST")

    }
