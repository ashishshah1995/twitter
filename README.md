# twitter

In this project where tweets are inputted by user. The file is serialize in Treets.java file

The following output is displayed

1 - We loop over all the tweets and displays the tweets according to the timestamp.

2- loop over the tweets and display each word of tweet  

3- Seperate Hashtags and Mentions seperately in an array

4- Count number of Hashtags if repeated

5- Display Tweets posted by Author seperately


# Example - Input
 For two tweets - 
 
 1 - "ashishshah", "Rock bottom will teach you #lessons that mountain tops never will. @Ashishshah1995.", new Date(1421849732000L)
 
 2-   "journeytocode", "The strongest factor for success is self esteem: #believing you can do it, believing you deserve it, believing you will get it.@journeytocode", new Date(1421878767000L)
      
     
# Output -

This is a new Treet:  Treet:  "Rock bottom will teach you #lessons that mountain tops never will. @Ashishshah1995." by ashishshah on Wed Jan 21 09:15:32 EST 2015 
The words are:

rock

bottom

will

teach

you

#lessons

that

mountain

tops

never

will

@ashishshah1995

Treet:  "Rock bottom will teach you #lessons that mountain tops never will. @Ashishshah1995." by ashishshah on Wed Jan 21 09:15:32 EST 2018

Treet:  "The strongest factor for success is self esteem: #believing you can do it, believing you deserve it, believing you will get it.@journeytocode" by journeytocode on Wed Jan 21 17:19:27 EST 2018

Hash tags: [#lessons, #believing] 

Mentions: [@ashishshah1995, @journeytocode] 

Hash tag counts: {#lessons=1, #believing=1} 

Treets by author: {ashishshah=[Treet:  "Rock bottom will teach you #lessons that mountain tops never will. @Ashishshah1995." by ashishshah on Wed Jan 21 09:15:32 EST 2018]}, 

journeytocode=[Treet:  "The strongest factor for success is self esteem: #believing you can do it, believing you deserve it, believing you will get it.@journeytocode" by journeytocode on Wed Jan 21 17:19:27 EST 2018]} 
