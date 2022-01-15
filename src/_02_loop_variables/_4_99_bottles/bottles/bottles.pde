void setup(){
 int numBeers=99;
 
 for (int i = 0; i < 100; i++) {

 
 int oneless=numBeers-1;
 String lyrics= numBeers +" bottles of beer on the wall, "+ numBeers +" bottles of beer. \nTake one down and pass it around, "+oneless+" bottles of beer on the wall.\n";
 if (numBeers==0){
 print("No more bottles of beer on the wall, no more bottles of beer\n Go to the store and buy some more, 99 bottles of beer on the wall.");
 }else{
   
print(lyrics); 
 }
 
 
 
 
   
 



numBeers=numBeers-1;

 }// END OF LOOP
}//END OF SETUP



void draw(){


}
