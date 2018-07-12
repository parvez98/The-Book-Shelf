# The-Book-Shelf
An Android app which reviews and provides sneak peaks of famous movies and TV shows that are based on novels.

## Inspiration
Got the inspiration when I discovered CardView in Android and decided to turn my book shelf into an app.

## Video Demo 
Click the image below to see the demo:

[![The Book Shelf](https://img.youtube.com/vi/ck8a9BdIPEc/0.jpg)](https://youtu.be/ck8a9BdIPEc)
 
## Description
- Presents a grid view of the novels
- Users can click on any novel to read details
- Details include a brief summary and slideshow of stills from the respective movie or TV show
- Compatible with landscape and portrait screen orientations

## How it is built
- [x] Uses **CardView** and **RecyclerView** along with **GridLayout** to build the UI
- [x] Utilizes **ViewFlipper** to create a slideshow of images
- [x] Built an Adapter class to transfer data from database to the **_main book activity_**
- [x] Programmed an algorithm to read and process database
