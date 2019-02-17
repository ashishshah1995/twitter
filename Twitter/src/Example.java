import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Example {

  public static void main(String[] args) {
    Treet treet = new Treet(
      "ashishshah",
      "Rock bottom will teach you #lessons that mountain tops never will. @Ashishshah1995.",
      new Date(1421849732000L)
    );
    Treet secondTreet = new Treet(
      "journeytocode",
      "The strongest factor for success is self esteem: #believing you can do it, believing you deserve it, believing you will get it.@journeytocode",
      new Date(1421878767000L)
    );
    System.out.printf("This is a new Treet:  %s %n", treet);
    System.out.println("The words are:");
    for (String word: treet.getWords()) {
      System.out.println(word);
    }
    Treet[] treets = {treet, secondTreet};
    Arrays.sort(treets);
    for (Treet exampleTreet: treets){
    System.out.println(exampleTreet);
   }
   Treets.save(treets);
    Treet[] reloadedTreets = Treets.load();
    for(Treet reloaded: reloadedTreets){
     System.out.println(reloaded);
    }
    Set<String> allHashTags = new HashSet<String>();
    Set<String> allMentions = new TreeSet<String>();
    for (Treet treet1 : treets) {
      allHashTags.addAll(treet1.getHashTags());
      allMentions.addAll(treet1.getMentions()); 
    }
    System.out.printf("Hash tags: %s %n", allHashTags);
    System.out.printf("Mentions: %s %n", allMentions);
    
    Map<String, Integer> hashTagCounts = new HashMap<String,Integer>();
    for(Treet treet1:treets){
     for(String hashTag: treet1.getHashTags()){
       Integer count = hashTagCounts.get(hashTag);
       if(count == null){
          count =0;
       
       }
       count++;
       hashTagCounts.put(hashTag,count);
     }
    }
    System.out.printf("Hash tag counts: %s %n",hashTagCounts);
    
    Map<String, List<Treet>> treetsByAuthor = new HashMap<String,List<Treet>>();
    for(Treet treet1: treets){
      List<Treet> authoredTreets = treetsByAuthor.get(treet1.getAuthor());
                                                      
      if(authoredTreets == null){
        authoredTreets = new ArrayList<Treet>();
        treetsByAuthor.put(treet1.getAuthor(),authoredTreets);
      }
      authoredTreets.add(treet1);
      
    System.out.printf("Treets by author: %s %n", treetsByAuthor);
      
    }
  }
  
  }
  