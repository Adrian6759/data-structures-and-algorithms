package datastructures.hashmap;

  public class hashmapDupes {
    public String repeatedWord(String str) {
      String[] key = str.split(" ");
      HashMap<String, Integer> wordsMap = new HashMap<String, Integer>(key.length);
      for (int i=0; i < key.length; i++){
        if (wordsMap.contains(key[i])) {
          wordsMap.set(key[i], wordsMap.get(key[i]) + 1);

        }else {
          wordsMap.set(key[i], + 1);
        }
//        for (int j = 0; i < key.length; i++) {
//          int count = wordsMap.get(key[i]);
//          if (count > 1) {
//            return key[i];
//          }

        }
      
        return "No repeated words";
    }
  }

