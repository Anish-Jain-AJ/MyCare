# MyCare
A complete healthcare solution with social connectivity and fitness features.

Features:
1) Login and regsiter using firebase authentication.
2) Enter user name and profile image compulsary for first time to continue further.
3) User can then see the feed with various posts from different people and their details along with profile photo, name and date.
4) Used image compressor library to upload both original and thumbnail image to database and retrieve first compressed image and then the
original one.
5) Made three fragments on main activity which are home which contains feed, fitness which contains other health related features and 
account for updating profile information.
6) Their is an option of adding a post, on clicking that button, user can post image along with description.
7) Implemented pagination on home page to retrive three posts at a time and retrive more based on scrolling feed.
8) In fitness fragment added options for calculating BMI, getting details of common disease symptoms, getting health tips and 
information about some doctors and hospitals. 
9) In action bar two options are available, one for logout and other for account information.
10) All data stored in firebase storage whose url are stored in firebase database specifically firebase firestore.

The main idea behind developing this was to bring a social app for health sector where people from different part of the world can 
communicate and share their idea and help each other. Also added functionality of fitness parameters and information is of great
significance and can help people.

Any suggestions are always welcome.

Note: googleservices.json file has been removed for security purposes, you need to add yours by getting it from the firebase.
