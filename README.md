# java-sorting-techiniques

This REPO contains some commonly used **array sorting techiniques**
<br />Please ⭐ this repository if you found it helpful so that more people can benifit from this code 😃. 
<br />
<br />
**[Get current updates open issues and pull requests in this repository]**

## [selection sort]
This is the selection sort techinique. You can find the whole program including accepting the array in this repo. 
```
//selection sort techinique
for(int i = 0 ; i < n-1 ; i++)
{
  //initialization 
  smallest = a[i] ; 
  indexOfSmallest = i ; 
  
  for(int j = i+1 ; j < n ; j++)
  {
    if(a[j] < smallest)
    {
      smallest = a[j]; 
      indexOfSmallest = j ; 
    }
  }
            
  //swpping the array
  temp = a[i];
  a[i] = a[indexOfSmallest];
  a[indexOfSmallest] = temp;
}
```
<img width="540" alt="image8 1 0" src="https://user-images.githubusercontent.com/76808676/105986897-861f0080-60c3-11eb-93eb-36d0b051011c.png">

## [bubble sort] 
This is the bubble sort techinique. You can find the whole program including accepting the array in this repo. 
```
//bubble sort techinique 
for(int i = 0 ;  i < n-1 ; i++)
{
  for(int j = 0 ; j < n-i-1 ; j++)
  {
    if(a[j] > a[j+1])
    {
      temp = a[j] ;
      a[j] = a[j+1];
      a[j+1] = temp; 
    }
  }
}
```
![image8 1 1](https://user-images.githubusercontent.com/76808676/105986903-87502d80-60c3-11eb-8326-98b5d22f8c50.png)

[selection sort]: https://github.com/voyager2005/java-sorting-techiniques/blob/main/selectionSort.java
[bubble sort]: https://github.com/voyager2005/java-sorting-techiniques/blob/main/bubbleSort.java
[Get current updates open issues and pull requests in this repository]: https://github.com/voyager2005/java-sorting-techiniques/pulse/monthly
