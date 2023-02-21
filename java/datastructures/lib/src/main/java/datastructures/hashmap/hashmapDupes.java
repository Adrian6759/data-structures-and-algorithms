package datastructures.hashmap;

  Public String repeatedWord(String str){
    String key[]=str.split;
    HashMap<String, Integer> wordsMap=new HashMap<String, Integer>();
    for(int=0;i<token.length;i++){
      if(wordsMap.containsKey(token[i]))
      wordsMap.put(token[i],wordsMap.get(token[i])+1);
      else{
     wordsMap.put(token[i]+1);
      }
      for(int i=0;i<token.length;i++){
      int count=wordsMap.get(token[i]);
      if(count>1){
      return token[i];
      }

    }
    return"No repeated words"
  }
