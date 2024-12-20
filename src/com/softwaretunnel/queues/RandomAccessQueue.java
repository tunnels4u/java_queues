package com.softwaretunnel.queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Author tunnels4u (Anjali) Queue with the ability to add at end, remove from
 * top and random access in constant time
 **/
public class RandomAccessQueue<E> {

	private List<E> list = new ArrayList<E>();
	private int indexOffset = 0;

	public void addLast(E e) {
		list.add(e);
	}

	public E removeFirst() {
		E e = this.get(0);
		shuffleListIndex();
		return e;
	}

	public E get(int index) {
		return (E) list.get((index + indexOffset));
	}

	private void shuffleListIndex() {

		int listSize = list.size();
		if (listSize > 1) {
			indexOffset++;
		} else {
			list.remove(0);
		}
	}

	public int size() {
		return (list.size() - indexOffset);
	}

}
