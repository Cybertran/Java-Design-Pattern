/**
 * 
 */
package interfacePattern;

/**
 * @author jitendra
 *
 */
public class LinearSearch implements Search
{
      int[]items ;
      int item;
  
      public LinearSearch(int[] arr){
	  this.items = arr;
      }
    @Override
    public int getItem(int item)
    {
	for(int i = 0 ;i< items.length ;i++){
	    if(items[i] == item){
		return i;
	    }
	}
	return -1;
    }

}
