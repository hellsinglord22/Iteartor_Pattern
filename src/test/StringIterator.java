package test;

public class StringIterator implements Iterator {

	/// Attributes ///
	private String[] strings;
	private int position;

	/**
	 * Constructor
	 *
	 * @param strings
	 *            a list of the strings to be iterated on
	 */
	public StringIterator(String[] strings) {
		this.strings = strings;
		position = 0;
	}

	/***
	 * hasNext
	 *
	 * @return true if their is element in the array ( the iterator ) iterate
	 *         over and false other wise
	 */
	@Override
	public boolean hasNext() {
		if (position >= strings.length || strings[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * next
	 *
	 * @return the current element the pointer of the iterator on
	 */
	@Override
	public Object next() {
		return strings[position++];
	}



}
