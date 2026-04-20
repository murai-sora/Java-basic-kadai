package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

		
   Map<String,String>Dictionary=new HashMap<>();
   public  Dictionary_Chapter21() {
   
	Dictionary.put("apple","りんご");
	Dictionary.put("peach","桃");
	Dictionary.put("banana","バナナ");
	Dictionary.put("lemon","レモン");
	Dictionary.put("pear","梨");
	Dictionary.put("kiwi","キウイ");
	Dictionary.put("strawberry","いちご");
	Dictionary.put("grape","ぶどう");
	Dictionary.put("muscat","マスカット");
	Dictionary.put("cherry","さくらんぼ");
    }
   public void search(String[]word) {
	   for(int i=0;i<word.length;i++) {
		   if(Dictionary.get(word[i])!=null) {
			 System.out.println(word[i]+"の意味は"+Dictionary.get(word[i]));
		   }else {
			   System.out.println(word[i]+"は辞書に存在しません");
			   
		   }
	   }
   }
 

  
}	

