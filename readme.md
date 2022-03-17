
# Show Amazing TOAST

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164118_First_Library%5B1%5D.jpg?alt=media&token=55c76cf4-a467-44ce-9c47-f181834b0b70 "Optional title")

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220316-164048_First_Library%5B1%5D.jpg?alt=media&token=4133d107-b6af-4173-998e-901b07cd8f2d "Optional title")

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
# Example on Success Toast       
ToasterMessage.Builder() 
            .setContext(context)  
            .setMessage("YOUR MESSAGE HERE") 
            .setSuccessBackgroundColor(R.color.cusom_color) // set custom background color default is green color
            .setCornerRadius(50) //  set custom corner radius if you want 
            .setSuccessIcon(R.drawable.ic_check) // set success custom image   
            .setGravityOfMessage(Gravity.TOP) // Where to display the message Gravity.TOP or Gravity.BOTTOM
            .setDuration(Toast.LENGTH_SHORT) // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG
            .build()
            .showMessage()
	    
	    
# Example on Error Toast       
ToasterMessage.Builder()
            .setContext(context)
            .setMessage("YOUR MESSAGE HERE")
            .setFieldBackgroundColor(R.color.cusom_color)  // set custom background color default is red color
            .setCornerRadius(50) //  set custom corner radius if you want
            .setFieldIcon(R.drawable.ic_check) // set success custom image
            .setGravityOfMessage(Gravity.TOP) // Where to display the message Gravity.TOP or Gravity.BOTTOM
            .setDuration(Toast.LENGTH_SHORT) // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG
            .build()
            .showMessage()

   
