
# Show Custom TOAST

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220317-143850_First_Library%5B1%5D.jpg?alt=media&token=7b6a4d92-85eb-43d7-8e84-363524192d35 )

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220317-143437_First_Library%5B1%5D.jpg?alt=media&token=e3234c1e-b065-4345-97c7-b9b6e3d52866 )

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
implementation 'com.github.abuanzeh:AnzehLibrary:1.0.4'
```
# Example on Success Toast       
       ToasterMessage.Builder()  
            //set context  
            .setContext(context)
            //set Your Message 
            .setMessage("YOUR MESSAGE HERE")
            //set custom background color default is green color  
            .setSuccessBackgroundColor(R.color.cusom_color)
            //set custom corner radius if you want  
            .setCornerRadius(50)
            //set success custom icon  
            .setSuccessIcon(R.drawable.ic_check)
            //Where to display the message Gravity.TOP or Gravity.BOTTOM  
            .setGravityOfMessage(Gravity.TOP)
            //Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG 
            .setDuration(Toast.LENGTH_SHORT)
            .build()  
            .showMessage()

	    
# Example on Error Toast       
        ToasterMessage.Builder()  
            //set context  
            .setContext(context)
            //set Your Message 
            .setMessage("YOUR MESSAGE HERE")
            //set custom background color default is green color  
            .setSuccessBackgroundColor(R.color.cusom_color)
            //set custom corner radius if you want  
            .setCornerRadius(50)
            //set success custom icon  
            .setSuccessIcon(R.drawable.ic_check)
            //Where to display the message Gravity.TOP or Gravity.BOTTOM  
            .setGravityOfMessage(Gravity.TOP)
            //Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG 
            .setDuration(Toast.LENGTH_SHORT)
            .build()  
            .showMessage()

   
