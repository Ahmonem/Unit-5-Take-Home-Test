class RandomWord {
    private String word;
    private String word2;
    private static String newWord = "";
  
    
    
  public RandomWord(){
    word = "";
    word2 = ""; 
  }
    
  
  public RandomWord(String initWord, String initWord2){
    word = initWord;
    word2 = initWord2;
    
  }
    
    //This method returns a random letter from the specified word. It has one integer parameter, which is either 1 (to select a random letter from the first word), or 2 (to select a random letter from the second word). This method also concatenates this random letter to the end of the new random word.
    public String randomLetter(int number){
      String letter;
      int numberz;
      if (number == 1){
        numberz = (int)(Math.random() * (word.length() - 1) + 1);
        letter = word.substring(numberz - 1, numberz);
        newWord += letter;
        System.out.println(letter);
      }
      else if (number == 2){
        numberz = (int)(Math.random() * (word.length() - 2) + 1);
        letter = word2.substring(numberz - 1, numberz);
        newWord += letter;
        System.out.println(letter);

      }
      else {
        System.out.println("Please enter 1 or 2");
      }    
      return newWord;    
    }
  
    //This method returns the new word which was constructed from the random letters and also reinitializes the new word so that the next word can be generated.
    public static String getNewWord(){
      
      System.out.println(newWord);
      newWord = "";
      return newWord;
        
  
    }
  
    
    public static void main(String[] args) {
        RandomWord rand1 = new RandomWord("zebra", "dog");
      
        RandomWord.getNewWord();
  
        rand1.randomLetter(1);
        rand1.randomLetter(2);
        rand1.randomLetter(1);

        RandomWord.getNewWord();
        RandomWord.getNewWord();

        rand1.randomLetter(2);
        rand1.randomLetter(2);

        RandomWord rand2 = new RandomWord("snake", "giraffe");

        rand2.randomLetter(1);
        rand2.randomLetter(2);

        RandomWord.getNewWord();


    }
  }
  
