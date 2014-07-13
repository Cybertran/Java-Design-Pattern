/**
 * 
 */
package interfaceExample;

/**
 * @author jitendra
 * 
 */
public class BinarySearch implements Search
{

    int[] items;
    int item;

    public BinarySearch(int[] arr)
    {
	this.items = arr;
    }

    @Override
    public int getItem(int item)
    {
	this.item = item;
	return findItem(0, items.length - 1, items);
    }

    private int findItem(int startIndex, int endIndex, int[] arr)
    {
	if (startIndex <= endIndex)
	{
	    int mid = (startIndex + endIndex) / 2;

	    if (arr[mid] == item)
	    {
		return mid;
	    }

	    else if (item > arr[mid])
	    {
		startIndex = mid + 1;
		return findItem(startIndex, endIndex, arr);
	    }
	    else if (item < arr[mid])
	    {
		endIndex = mid - 1;
		return findItem(startIndex, endIndex, arr);
	    }
	}
	return -1;

    }

}
