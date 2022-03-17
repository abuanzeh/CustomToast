
# Show Custom TOAST

![Alt text](https://firebasestorage.googleapis.com/v0/b/alhafeth-d4c48.appspot.com/o/Screenshot_20220317-143850_First_Library%5B1%5D.jpg?alt=media&token=7b6a4d92-85eb-43d7-8e84-363524192d35 "Optional title")

![Alt text](https://camo.githubusercontent.com/2bac188a30fea61561735a89483760b3f682566fcf29ad499592615f6b500bfe/68747470733a2f2f666972656261736573746f726167652e676f6f676c65617069732e636f6d2f76302f622f616c6861666574682d64346334382e61707073706f742e636f6d2f6f2f53637265656e73686f745f32303232303331372d3134333835305f46697273745f4c696272617279253542312535442e6a70673f616c743d6d6564696126746f6b656e3d37623661346439322d383565622d343364372d386538342d333633353234313932643335 "Optional title")

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
ToasterMessage.Builder() <br/>
            .setContext(context)  <br/>
            .setMessage("YOUR MESSAGE HERE") <br/>
            .setSuccessBackgroundColor(R.color.cusom_color) // set custom background color default is green color <br/>
            .setCornerRadius(50) //  set custom corner radius if you want <br/>
            .setSuccessIcon(R.drawable.ic_check) // set success custom image   <br/>
            .setGravityOfMessage(Gravity.TOP) // Where to display the message Gravity.TOP or Gravity.BOTTOM <br/>
            .setDuration(Toast.LENGTH_SHORT) // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG <br/>
            .build() <br/>
            .showMessage() <br/>
	    
	    
# Example on Error Toast       
ToasterMessage.Builder() <br/>
            .setContext(context) <br/>
            .setMessage("YOUR MESSAGE HERE") <br/>
            .setFieldBackgroundColor(R.color.cusom_color)  // set custom background color default is red color <br/>
            .setCornerRadius(50) //  set custom corner radius if you want <br/>
            .setFieldIcon(R.drawable.ic_check) // set success custom image <br/>
            .setGravityOfMessage(Gravity.TOP) // Where to display the message Gravity.TOP or Gravity.BOTTOM <br/>
            .setDuration(Toast.LENGTH_SHORT) // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG <br/>
            .build() <br/>
            .showMessage() <br/>

   
